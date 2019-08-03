package com.blume.locus.hackathontimeapi.controllers;

import com.blume.locus.hackathontimeapi.xmlModels.LatLong;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/nodes")
public class GetOsmNodes {

    private static final String FILE_PATH = "C:\\Users\\user\\Hackathon\\hackathon-time-api\\src\\main\\resources\\sarjapur_osm_nodes.txt";

    private static final String FILE_TO_WRITE = "C:\\Users\\user\\Hackathon\\hackathon-time-api\\src\\main\\resources\\sarjapur_osm_output_nodes.txt";

    @RequestMapping(method = RequestMethod.GET, value = "", produces = "application/json")
    public ResponseEntity<String> getRoutes() throws IOException {

        parseAndSaveLatLongImproved();

        return new ResponseEntity<>("1.0", HttpStatus.OK);
    }

    private void writeLatLongToFile(List<LatLong> latLongList) {

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_TO_WRITE));
            for (LatLong latLong : latLongList) {
                bw.write(latLong.toString() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void parseAndSaveLatLongImproved() {
        try {

            File fXmlFile = new File(FILE_PATH);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("node");
            NodeList wayNodes = doc.getElementsByTagName("way");

            List<LatLong> latLongList = new ArrayList<>();
            Set<String> nodeIds = new HashSet<>();

            int count = 0, highwayNodes = 0;
            for (int i = 0; i < wayNodes.getLength(); i++) {
                Node node = wayNodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    count++;
                    Element element = (Element) node;
                    NodeList tags = element.getElementsByTagName("tag");
                    NodeList nodes = element.getElementsByTagName("nd");

                    for (int j = 0; j < tags.getLength(); j++) {
                        Node tag = tags.item(j);
                        if (tag.getAttributes().getNamedItem("k").getNodeValue().equals("highway")) {

                            for (int k = 0; k < nodes.getLength(); k++) {
                                nodeIds.add(nodes.item(k).getAttributes().getNamedItem("ref").getNodeValue());
                                highwayNodes++;
                            }
                            break;
                        }
                    }
                }
            }

            int foundNodes = 0;
            System.out.println("-------------------------------------- nodes size " + nodeList.getLength());
            System.out.println("Unique Nodes = " + nodeIds.size());
            for (int i = 0; i < nodeIds.size(); i++) {
                Node node = nodeList.item(i);
                if (node != null) {
                    if (nodeIds.contains(node.getAttributes().getNamedItem("id").getNodeValue())) {
                        latLongList.add(new LatLong(node.getAttributes().getNamedItem("lat").getNodeValue(),
                                node.getAttributes().getNamedItem("lon").getNodeValue()));
                        foundNodes++;
                    }
                }
            }

            writeLatLongToFile(latLongList);

            System.out.println("wayNodes = " + count);
            System.out.println("highwayNodes = " + highwayNodes);
            System.out.println("foundNodes = " + foundNodes);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void parseAndSaveLatLong() {
        try {

            File fXmlFile = new File(FILE_PATH);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("node");

            List<LatLong> latLongList = new ArrayList<>();

            int count = 0, highwayNodes = 0;
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    count++;
                    Element element = (Element) node;
                    NodeList tags = element.getElementsByTagName("tag");

                    for (int j = 0; j < tags.getLength(); j++) {
                        Node tag = tags.item(j);
                        if (tag.getAttributes().getNamedItem("k").getNodeValue().equals("highway")) {
                            highwayNodes++;
                            latLongList.add(new LatLong(node.getAttributes().getNamedItem("lat").getNodeValue(),
                                    node.getAttributes().getNamedItem("lon").getNodeValue()));
                        }
                    }
                }
            }

            writeLatLongToFile(latLongList);

            System.out.println("nodes = " + count);
            System.out.println("highwayNodes = " + highwayNodes);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

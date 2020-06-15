package com.mbor.converterservice.factories.nodes;


import com.mbor.converterservice.components.ComponentNode;
import com.mbor.converterservice.components.Node;
import com.mbor.converterservice.components.NodeList;
import com.mbor.converterservice.factories.printers.AbstractPrinterFactory;


public class NodeFactory {

   private final AbstractPrinterFactory abstractPrinterFactory;

    public NodeFactory(AbstractPrinterFactory abstractPrinterFactory) {
        this.abstractPrinterFactory = abstractPrinterFactory;
    }

    public ComponentNode getComponentNodeWithNode(){
        return new ComponentNode(abstractPrinterFactory.getComponentNodeWithNodePrinter());
    }

    public  ComponentNode getComponentNodeWithNodeList(){
        return new ComponentNode(abstractPrinterFactory.getComponentNodeWithNodeListPrinter());
    }

    public Node getNodeWithNoValue(String elementName){
        return new Node(elementName, abstractPrinterFactory.getNodeWithNoValuePrinter());
    }
    public Node getNodeWithValue(String elementName, String value){
        return new Node(elementName, value,  abstractPrinterFactory.getNodeWithValuePrinter());
    }
    public Node getNodeWithAttributes(String elementName, String value){
        return new Node(elementName,  value, abstractPrinterFactory.getNodeWithAttributesPrinter());
    }

    public Node getNodeWithAttributes(String elementName){
        return new Node(elementName, abstractPrinterFactory.getNodeWithAttributesPrinter());
    }

    public NodeList getNodeList(String elementName){
        return new NodeList(elementName, abstractPrinterFactory.getNodeListPrinter());
    }

    public  NodeList getEqualNodeList(String elementName){
       return new NodeList(elementName, abstractPrinterFactory.getNodeEqualListPrinter());
    }


}

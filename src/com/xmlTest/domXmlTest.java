package com.xmlTest;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/2.
 */
public class domXmlTest {

/*
* 三种节点类型   NodeType    Named Constant   nodeName的返回值   nodeValue的返回值
* Element       1           Element_NODE        element name        null
* Attr          2           ATTRIBUTE_NODE      属性名称            属性值
* Text          3           TEXT_NODE           #text              节点内容
*/

/*
* 问题如何存数xml文件的结构？
*
* */

    public static void main(String[] args) {
        // 创建一个DocumentBuilderFactory的对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // 创建一个DocumentBuilder对象
            DocumentBuilder db = dbf.newDocumentBuilder();
            // 通过DocumentBuilder对象的parser方法加载boosStore.xml到当前项目下
            Document doc = db.parse("bookStore.xml");
            // 获取所有book节点集合
            NodeList bookList = doc.getElementsByTagName("book");
            // 遍历每一个book节点
            for (int i = 0; i < bookList.getLength(); i++) {
                /*
                * 解析book节点
                * */
                // 前提：不知道节点属性的情况下进行遍历。
                // 获取单个book节点，nodeList的索引值从0开始
                // Node book = bookList.item(i);
                // 获取book节点的所有属性值集合
                // NamedNodeMap attrs = book.getAttributes();
                // 遍历book的属性
                /*for (int j=0; j<attrs.getLength(); j++ ) {
                    // 通过item(index)获取的属性值
                    String name = attrs.item(j).getNodeName();
                    // 获取属性值
                    String val = attrs.item(j).getNodeValue();
                    // 答应输入结果
                    System.out.println("属性名是"+ name +":" + "属性值是"+ val);
                }*/


                // 前提： 已经知道book节点有且只能有一个id属性
                // 将book节点强制类型转换，转换正Element类型
                Element book = (Element) bookList.item(i);
                // 通过getAttribute("id")获取有id属性节点的id属性值
                String attrVal = book.getAttribute("id");
                //System.out.print(attrVal);

                /*
                * 解析book节点的子节点
                *   常用的节点类型有三类 element、attrs、text
                *   所以当你遍历子节点集合，可能和xml字节点个数不同
                * */
                NodeList childNodes = book.getChildNodes();
                // 遍历childNodes获取每个节点的，会将每个空白和换行看成一个子节点
                for (int k = 0; k < childNodes.getLength(); k++) {
                    // 区分出text类型的node以及Element类型的Node；
                    if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE){
                        // 获取element类型节点的节点名
                        String name = childNodes.item(k).getNodeName();
                        // 获取elemtn类型节点的几点值（通过孙节点）
                        // String val = childNodes.item(k).getFirstChild().getNodeValue();
                        // 或者直接通过getTextContent方法直接获得节点值（能够获取所有嵌套节点的节点值（文本））
                        String val = childNodes.item(k).getTextContent();
                        // System.out.println("节点名"+name+":节点值是" + val);
                    }

                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

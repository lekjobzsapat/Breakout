package game;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import essentials.Board;
import essentials.Breakout;

public final  class Loader {
	
	static ArrayList<String> lines=new ArrayList<String>();
	static void Load(String file_name)
	{
		
		readXml(file_name);
	}
	
	private static void readXml(String file_name)
	{
		int lines_count;
		String level_name;
		
		
		 try {
		     File xmlFile = new File("src/"+file_name+"/Info.xml");
		     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder builder = factory.newDocumentBuilder();
		     Document doc = builder.parse(xmlFile);
		     NodeList levelNodes = doc.getElementsByTagName("level");
		     
		     String background_name = doc.getElementsByTagName("line").toString();
		     
		     
		     Node levelNode = levelNodes.item(0);
		     
		     Element levelElement = (Element) levelNode;
		     level_name = levelElement.getElementsByTagName("name").item(0).getTextContent();
		     lines_count=doc.getElementsByTagName("line").getLength();
		     
		     
		     //System.out.println("background_name = " + background_name);
            // System.out.println("level_name = " + level_name);
             
             
		     for (int i = 0; i < lines_count; i++) {

		         lines.add(levelElement.getElementsByTagName("line").item(i).getTextContent());

		     }
		     Startlevel(file_name);
		 } catch (ParserConfigurationException | SAXException | IOException e) {
		     e.printStackTrace();
		 }
		 
	}
	
	private static void Startlevel(String file_name) {
		var game = new Breakout(file_name,lines);
		game.setVisible(true);
	}
	
}

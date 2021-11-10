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
import java.net.URL;
import java.util.ArrayList;
import org.springframework.core.io;


import essentials.Board;
import essentials.Breakout;

public final  class Loader {
	
	
	static void Load(String file_name)
	{
		
		readXml(file_name);
	}
	
	private static void readXml(String file_name)
	{
		int lines_count;
		
		int row;
		int column;
		int width;
		int height;
		ArrayList<String> lines=new ArrayList<String>();
	 	int[] datas;
	 	String level_name;
		
		 try {
			 //getClass().getResource("/excludedir.properties").getFile())
		     //File xmlFile = new File("src/"+file_name+"/Info.xml");
			 System.out.println("src/"+file_name+"/Info.xml");
			 File xmlFile = new File(Loader.class.getResource("src/"+file_name+"/Info.xml").getFile());
			 
		     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder builder = factory.newDocumentBuilder();
		     Document doc = builder.parse(xmlFile);
		     NodeList levelNodes = doc.getElementsByTagName("level");
		     
		    
		     
		     Node levelNode = levelNodes.item(0);
		     
		     Element levelElement = (Element) levelNode;
		     lines_count=doc.getElementsByTagName("line").getLength();
		     level_name = levelElement.getElementsByTagName("name").item(0).getTextContent();
		     row=Integer.parseInt(levelElement.getElementsByTagName("row").item(0).getTextContent());
		     column=Integer.parseInt(levelElement.getElementsByTagName("column").item(0).getTextContent());
		     width=Integer.parseInt(levelElement.getElementsByTagName("width").item(0).getTextContent());
		     height=Integer.parseInt(levelElement.getElementsByTagName("height").item(0).getTextContent());
		     
		     
		     //System.out.println("background_name = " + background_name);
            // System.out.println("level_name = " + level_name);
             
             
		     for (int i = 0; i < lines_count; i++) {

		         lines.add(levelElement.getElementsByTagName("line").item(i).getTextContent());

		     }
		     datas= new int[]{row,column,width,height};
		     Startlevel(level_name,file_name,lines,datas);
		 } catch (ParserConfigurationException | SAXException | IOException e) {
		     e.printStackTrace();
		 }
		 
	}
	
	private static void Startlevel(String level_name,String file_name,ArrayList<String> lines,int[] datas ) {
		var game = new Breakout(level_name,file_name,lines,datas);
		game.setVisible(true);
	}
	
}

package starting.model;

import java.awt.Color;
import java.util.ArrayList;

public class TrianglePuzzle {
	
	public TrianglePuzzle() {
		Node nodeOne = new Node(210, 10, 20, 20);
		Node nodeTwo = new Node(160, 120, 20, 20);
		Node nodeThree = new Node(260, 120, 20, 20);
		Node nodeFour = new Node(110, 230, 20, 20);
		Node nodeFive = new Node(210, 230, 20, 20);
		Node nodeSix = new Node(310, 230, 20, 20);
		Node nodeSeven = new Node(60, 340, 20, 20);
		Node nodeEight = new Node(160, 340, 20, 20);
		Node nodeNine = new Node(260, 340, 20, 20);
		Node nodeTen = new Node(360, 340, 20, 20);
		
		ArrayList<Node> nodeList = new ArrayList<Node>();
		nodeList.add(nodeOne);
		nodeList.add(nodeTwo);
		nodeList.add(nodeThree);
		nodeList.add(nodeFour);
		nodeList.add(nodeFive);
		nodeList.add(nodeSix);
		nodeList.add(nodeSeven);
		nodeList.add(nodeEight);
		nodeList.add(nodeNine);
		nodeList.add(nodeTen);
		
		Edge triangleOneLeft = new Edge("triangleOneLeft", nodeOne, nodeTwo, Color.RED);
		Edge triangleOneRight = new Edge("triangleOneRight", nodeOne, nodeThree, Color.RED);
		Edge triangleOneBottom = new Edge("triangleOneBottom", nodeTwo, nodeThree, Color.GREEN);
		Edge triangleTwoLeft = new Edge("triangleTwoLeft", nodeTwo, nodeFour, Color.RED);
		Edge triangleTwoRight = new Edge("triangleTwoRight", nodeTwo, nodeFive, Color.BLUE);
		Edge triangleTwoBottom = new Edge("triangleTwoBttom", nodeFour, nodeFive, Color.GREEN);
		Edge triangleThreeLeft = new Edge("triangleThreeLeft", nodeThree, nodeFive, Color.BLUE);
		Edge triangleThreeRight = new Edge("triangleThreeRight", nodeThree, nodeSix, Color.RED);
		Edge triangleThreeBottom = new Edge("triangleThreeBottom", nodeFive, nodeSix, Color.GREEN);
		Edge triangleFourLeft = new Edge("triangleFourLeft", nodeFour, nodeSeven, Color.RED);
		Edge triangleFourRight = new Edge("triangleFourRight", nodeFour, nodeEight, Color.BLUE);
		Edge triangleFourBottom = new Edge("triangleFourBottom", nodeSeven, nodeEight, Color.GREEN);
		Edge triangleFiveLeft = new Edge("triangleFiveLeft", nodeFive, nodeEight, Color.BLUE);
		Edge triangleFiveRight = new Edge("triangleFiveRight", nodeFive, nodeNine, Color.BLUE);
		Edge triangleFiveBottom = new Edge("triangleFiveBottom", nodeEight, nodeNine, Color.GREEN);
		Edge triangleSixLeft = new Edge("triangleSixLeft", nodeSix, nodeNine, Color.BLUE);
		Edge triangleSixRight = new Edge("triangleSixRight", nodeSix, nodeTen, Color.RED);
		Edge triangleSixBottom = new Edge("triangleSixBottom", nodeNine, nodeTen, Color.GREEN);
		
		ArrayList<Edge> edgeList = new ArrayList<Edge>();
		edgeList.add(triangleOneLeft);
		edgeList.add(triangleOneRight);
		edgeList.add(triangleOneBottom);
		edgeList.add(triangleTwoLeft);
		edgeList.add(triangleTwoRight);
		edgeList.add(triangleTwoBottom);
		edgeList.add(triangleThreeLeft);
		edgeList.add(triangleThreeRight);
		edgeList.add(triangleThreeBottom);
		edgeList.add(triangleFourLeft);
		edgeList.add(triangleFourRight);
		edgeList.add(triangleFourBottom);
		edgeList.add(triangleFiveLeft);
		edgeList.add(triangleFiveRight);
		edgeList.add(triangleFiveBottom);
		edgeList.add(triangleSixLeft);
		edgeList.add(triangleSixRight);
		edgeList.add(triangleSixBottom);
		
		Triangle triangleOne = new Triangle(1, triangleOneLeft, triangleOneRight, triangleOneBottom);
		Triangle triangleTwo = new Triangle(2, triangleTwoLeft, triangleTwoRight, triangleTwoBottom);
		Triangle triangleThree = new Triangle(3, triangleThreeLeft, triangleThreeRight, triangleThreeBottom);
		Triangle triangleFour = new Triangle(4, triangleFourLeft, triangleFourRight, triangleFourBottom);
		Triangle triangleFive = new Triangle(5, triangleFiveLeft, triangleFiveRight, triangleFiveBottom);
		Triangle triangleSix = new Triangle(6, triangleSixLeft, triangleSixRight, triangleSixBottom);
		
		ArrayList<Triangle> triangleList = new ArrayList<Triangle>();
		triangleList.add(triangleOne);
		triangleList.add(triangleTwo);
		triangleList.add(triangleThree);
		triangleList.add(triangleFour);
		triangleList.add(triangleFive);
		triangleList.add(triangleSix);
	}

}

package model;

import java.awt.Color;
import java.util.ArrayList;

public class TrianglePuzzle {
	
	public ArrayList<Node> nodeList;
	public ArrayList<Edge> edgeList;
	public ArrayList<Triangle> triangleList;
	public int score;
	public int moves;

	public TrianglePuzzle() {
		this.score = 0;
		this.moves = 0;
		Node nodeOne = new Node(210, 10, 20, 20, false);
		Node nodeTwo = new Node(160, 120, 20, 20, false);
		Node nodeThree = new Node(260, 120, 20, 20, false);
		Node nodeFour = new Node(110, 230, 20, 20, false);
		Node nodeFive = new Node(210, 230, 20, 20, false);
		Node nodeSix = new Node(310, 230, 20, 20, false);
		Node nodeSeven = new Node(60, 340, 20, 20, false);
		Node nodeEight = new Node(160, 340, 20, 20, false);
		Node nodeNine = new Node(260, 340, 20, 20, false);
		Node nodeTen = new Node(360, 340, 20, 20, false);
		
		this.nodeList = new ArrayList<Node>();
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
		
		Edge triangleOneLeft = new Edge("triangleOneLeft", nodeOne, nodeTwo, 220, 170, 20, 130, Color.RED, false);
		Edge triangleOneRight = new Edge("triangleOneRight", nodeOne, nodeThree, 220, 270, 20, 130, Color.RED, false);
		Edge triangleOneBottom = new Edge("triangleOneBottom", nodeTwo, nodeThree, 170, 270, 130, 130, Color.GREEN, false);
		Edge triangleTwoLeft = new Edge("triangleTwoLeft", nodeTwo, nodeFour, 170, 120, 130, 240, Color.RED, false);
		Edge triangleTwoRight = new Edge("triangleTwoRight", nodeTwo, nodeFive, 170, 220, 130, 240, Color.BLUE, false);
		Edge triangleTwoBottom = new Edge("triangleTwoBttom", nodeFour, nodeFive, 120, 220, 240, 240, Color.GREEN, false);
		Edge triangleThreeLeft = new Edge("triangleThreeLeft", nodeThree, nodeFive, 270, 220, 130, 240, Color.BLUE, false);
		Edge triangleThreeRight = new Edge("triangleThreeRight", nodeThree, nodeSix, 270, 320, 130, 240, Color.RED, false);
		Edge triangleThreeBottom = new Edge("triangleThreeBottom", nodeFive, nodeSix, 220, 320, 240, 240, Color.GREEN, false);
		Edge triangleFourLeft = new Edge("triangleFourLeft", nodeFour, nodeSeven, 120, 70, 240, 350, Color.RED, false);
		Edge triangleFourRight = new Edge("triangleFourRight", nodeFour, nodeEight, 120, 170, 240, 350, Color.BLUE, false);
		Edge triangleFourBottom = new Edge("triangleFourBottom", nodeSeven, nodeEight, 70, 170, 350, 350, Color.GREEN, false);
		Edge triangleFiveLeft = new Edge("triangleFiveLeft", nodeFive, nodeEight, 220, 170, 240, 350, Color.BLUE, false);
		Edge triangleFiveRight = new Edge("triangleFiveRight", nodeFive, nodeNine, 220, 270, 240, 350, Color.BLUE, false);
		Edge triangleFiveBottom = new Edge("triangleFiveBottom", nodeEight, nodeNine, 170, 270, 350, 350, Color.GREEN, false);
		Edge triangleSixLeft = new Edge("triangleSixLeft", nodeSix, nodeNine, 320, 270, 240, 350, Color.BLUE, false);
		Edge triangleSixRight = new Edge("triangleSixRight", nodeSix, nodeTen, 320, 370, 240, 350, Color.RED, false);
		Edge triangleSixBottom = new Edge("triangleSixBottom", nodeNine, nodeTen, 270, 370, 350, 350, Color.GREEN, false);
		
		this.edgeList = new ArrayList<Edge>();
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
		
		Triangle triangleOne = new Triangle(1, triangleOneLeft, triangleOneRight, triangleOneBottom, false, false, false);
		Triangle triangleTwo = new Triangle(2, triangleTwoLeft, triangleTwoRight, triangleTwoBottom, false, false, false);
		Triangle triangleThree = new Triangle(3, triangleThreeLeft, triangleThreeRight, triangleThreeBottom, false, false, false);
		Triangle triangleFour = new Triangle(4, triangleFourLeft, triangleFourRight, triangleFourBottom, false, false, false);
		Triangle triangleFive = new Triangle(5, triangleFiveLeft, triangleFiveRight, triangleFiveBottom, false, false, false);
		Triangle triangleSix = new Triangle(6, triangleSixLeft, triangleSixRight, triangleSixBottom, false, false, false);
		
		this.triangleList = new ArrayList<Triangle>();
		triangleList.add(triangleOne);
		triangleList.add(triangleTwo);
		triangleList.add(triangleThree);
		triangleList.add(triangleFour);
		triangleList.add(triangleFive);
		triangleList.add(triangleSix);
	}
	
	public void setMoves(int moves) {
		this.moves = moves;
	}
	
	public int getMoves() {
		return this.moves;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}

}

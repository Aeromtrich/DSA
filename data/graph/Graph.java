//package com.data.graph;

import java.util.*;
/*
public class Graph {

    private Map<String, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    private List<Edge> getEdge(String curVertex) {
       return adjList.get(curVertex);
    }


    // 添加一条边：from -> to，带权重
    public void addEdge(String from, String to, int weight) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.get(from).add(new Edge(to, weight));
    }

    // 打印图结构
    public void printGraph() {
        for (String from : adjList.keySet()) {
            System.out.print("节点 " + from + " 的邻居：");
            for (Edge edge : adjList.get(from)) {
                System.out.print("-> " + edge.to + "(权重:" + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    // DFS遍历
    public void dfs(String start) {
        Set<String> visited = new HashSet<>();
        System.out.print("DFS遍历结果：");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(String node, Set<String> visited) {
        if (visited.contains(node)) return;

        visited.add(node);
        System.out.print(node + " ");

        if (adjList.containsKey(node)) {
            for (Edge edge : adjList.get(node)) {
                dfsHelper(edge.to, visited);
            }
        }
    }

    // BFS遍历
    public void bfs(String start) {
        LinkedList<Object> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        System.out.print("BFS遍历结果：");
        System.out.println();

        while (!queue.isEmpty()) {
            String node = (String) queue.poll();
            System.out.print(node + " ");

            if (adjList.containsKey(node)) {
                for (Edge edge : adjList.get(node)) {
                    if (!visited.contains(edge.to)) {
                        visited.add(edge.to);
                        queue.offer(edge.to);
                    }

                }
            }
        }
    }



    // Dijkstra 算法求解最短路径
    public void dijkstra(String start) {

        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        Set<String> unvisited = new HashSet<>();

        // 初始化距离和前驱节点
        for (String vertex : adjList.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
            previous.put(vertex, null);
            unvisited.add(vertex);
        }
        distances.put(start, 0);

        while (!unvisited.isEmpty()) {
            String currentVertex = getMinDistanceVertex(unvisited, distances);
            unvisited.remove(currentVertex);

            if (adjList.containsKey(currentVertex)) {
                for (Edge edge : adjList.get(currentVertex)) {
                    int distance = distances.get(currentVertex) + edge.weight;
                    if (distance < distances.get(edge.to)) {
                        distances.put(edge.to, distance);
                        previous.put(edge.to, currentVertex);
                    }
                }
            }
        }

        // 打印最短路径
        System.out.println("Dijkstra 算法求解最短路径:");
        for (String vertex : adjList.keySet()) {
            System.out.println("从 " + start + " 到 " + vertex + " 的最短距离是 " + distances.get(vertex));
            System.out.println("路径是 " + getShortestPath(start, vertex, previous));
        }
    }

    // 获取距离最小的顶点
    private String getMinDistanceVertex(Set<String> unvisited, Map<String, Integer> distances) {
        String minVertex = null;
        int minDistance = Integer.MAX_VALUE;
        for (String vertex : unvisited) {
            if (distances.get(vertex) < minDistance) {
                minVertex = vertex;
                minDistance = distances.get(vertex);
            }
        }
        return minVertex;
    }

    // 获取最短路径
    private String getShortestPath(String start, String end, Map<String, String> previous) {
        StringBuilder path = new StringBuilder();
        String currentVertex = end;
        while (currentVertex != null) {
            path.insert(0, currentVertex + " ");
            currentVertex = previous.get(currentVertex);
        }
        return path.toString().trim();
    }


}

*/

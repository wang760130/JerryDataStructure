package com.jerry.graph;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 图测试
 * @author Jerry Wang
 *
 */
public class GraphTest {
	Graph<String> graph = null;
	Node<String> a = null;

	@Before
	public void init() {
		// 构造需要点对象
		a = new Node<String>("a");
		Node<String> b = new Node<String>("b");
		Node<String> c = new Node<String>("c");
		Node<String> d = new Node<String>("d");
		Node<String> e = new Node<String>("e");
		Node<String> f = new Node<String>("f");
		Node<String> g = new Node<String>("g");
		Node<String> h = new Node<String>("h");

		Arc<String> ab = new Arc<String>(a, b);
		Arc<String> ac = new Arc<String>(a, c);
		Arc<String> ad = new Arc<String>(a, d);
		Arc<String> ah = new Arc<String>(a, h);
		Arc<String> bc = new Arc<String>(b, c);
		Arc<String> de = new Arc<String>(d, e);
		Arc<String> ef = new Arc<String>(e, f);
		Arc<String> eg = new Arc<String>(e, g);
		Arc<String> hg = new Arc<String>(h, g);

		// 建立它们的关系
		a.getOutgoing().add(ab);
		a.getOutgoing().add(ac);
		a.getOutgoing().add(ad);
		a.getOutgoing().add(ah);
		b.getOutgoing().add(bc);
		d.getOutgoing().add(de);
		e.getOutgoing().add(ef);
		e.getOutgoing().add(eg);
		h.getOutgoing().add(hg);

		graph = new Graph<String>();
	}

	/**
	 * 广度遍历
	 */
	@Test
	public void testWidthSearch() {
		System.out.println("广度遍历如下：");
		graph.widthSearch(a);
	}
	
	/**
	 * 深度遍历
	 */
	@Test
	public void testDeptFisrtSearch() {
		System.out.println("深度遍历如下：");
		List<Node<String>> visited = new ArrayList<Node<String>>();
		graph.deptFirstSearch(a, visited);
	}
	
}

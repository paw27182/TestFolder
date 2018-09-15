//package algorithms;
//
//public class GraphTraversalBFS {
//
//	public void BFS(BinaryNode<T> root) {
//		if (root == null)
//			return;
//		Queue<BinaryNode<T>> queue = new Queue<>();
//		queue.enqueue(root);
//
//		while (!queue.isEmpty()) {
//			BinaryNode<T> node = queue.dequeue();
//			visit(node);
//			if (node.left != null) {
//				queue.enqueue(node.left);
//			}
//			if (node.right != null) {
//				queue.enqueue(node.right);
//			}
//		}
//	}
//}
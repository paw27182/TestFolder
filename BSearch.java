package algorithms;

public class BSearch {

	/* ループでの実装： 見つかったら添え字を返す O(logN) */

	public static int BinarySearch(int[] array, int target) {

		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			/* 中央の値を見る */
			int mid = (left + right) / 2;
			int value = array[mid];

			if (target < value) {
				/* 探索したい値が左にある： 右を狭める */
				right = mid - 1;
			} else if (value < target) {
				/* 探索したい値が右にある： 左を狭める */
				left = mid + 1;
			} else {
				/* 探索したい値が見つかった */
				return mid;
			}
		} // while

		return -1;
	}

	/* 再帰での実装： 見つかったら添え字を返す O(logN) */
	public static int BinarySearchRecursive(int[] array, int target) {

		return binarySearchRecursive(array, target, 0, array.length - 1);

	}

	private static int binarySearchRecursive(int[] array, int target, int left, int right) {

		if (right < left) {
			return -1;
		}

		int mid = (left + right) / 2;
		int value = array[mid];
		if (target < value) {
			return binarySearchRecursive(array, target, left, mid - 1);

		} else if (value < target) {
			return binarySearchRecursive(array, target, mid + 1, right);
		} else {
			return mid;
		}

	}

	/* テスト */
	public static void main(String[] args) {

		int[] array = { 1, 5, 9 };

		assert BinarySearch(array, 1) == 0;
		assert BinarySearch(array, 5) == 1;
		assert BinarySearch(array, 9) == 2;
		assert BinarySearch(array, 3) == -1;

		assert BinarySearchRecursive(array, 1) == 0;
		assert BinarySearchRecursive(array, 5) == 1;
		assert BinarySearchRecursive(array, 9) == 2;
		assert BinarySearchRecursive(array, 3) == -1;

	}

}

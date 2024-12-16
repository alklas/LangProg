class GenericMethDemo {
	static <T extends Comparable <T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
		if(x.length != y.length) 
			return false;
		for(int i=0; i < x.length; i++)
			if(!x[i].equals(y[i]))
				return false;
		return true;
	}
	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4};
		Integer[] nums2 = {1,2,3,4};
		Integer[] nums3 = {1,2,3,4,5};
		Integer[] nums4 = {1,3,2,4,5};

		if(arraysEqual(nums, nums2))
			System.out.println("nums совпадает с nums2");
		else 
			System.out.println("nums не совпадает с nums2");

		if(arraysEqual(nums, nums3))
                        System.out.println("nums совпадает с nums3");
		else
                        System.out.println("nums не совпадает с nums3");

		if(arraysEqual(nums, nums4))
                        System.out.println("nums совпадает с nums4");
		else
                        System.out.println("nums не совпадает с nums4");

		String[] strs = {"1234", "343232", "32424", "424234"};
		String[] strs2 = {"1234", "343232", "32424", "42423"};

		if(arraysEqual(strs, strs2))
                        System.out.println("strs совпадает с strs2");
                else
                        System.out.println("strs не совпадает с strs2");
	}
}

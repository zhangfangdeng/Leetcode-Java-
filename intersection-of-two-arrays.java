class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> res = new HashMap<>();
        List<Inreger> list1 = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            list1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length, i++){
            if(list1.contains(nums2[i]))
                res.put(nums2[i], nums2[i]);
        }
        int[] result = new int[res.size()];
        int i = 0;
        for(Integer value : res.values()){
            result[i++] = value;
        }
        return result;
    }
}



class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashset = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int e : nums1){
            if(!hashset.contains(e))
                hashset.add(e);
        }
        int i = 0;
        for(int e : nums2){
            if(hashset.contains(e)){
                hashset.remove(e);
                nums2[i++] = e;
            }
        }
        return Arrays.copyOfRange(nums2, 0, i);
    }
}

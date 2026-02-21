class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxChunks=0;
        int chunks=0;
        for(int i=0;i<arr.length;i++){
            maxChunks=Math.max(maxChunks,arr[i]);

            if(maxChunks==i){
                chunks++;
            }

        }   
        return chunks;

    }
}
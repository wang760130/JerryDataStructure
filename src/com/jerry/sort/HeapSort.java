package com.jerry.sort;

/**
 * 堆排序
 * @author Jerry Wang
 *
 */
public class HeapSort extends Sort{

	@Override
	public void sort(int[] data) {
		MaxHeap heap = new MaxHeap();
		heap.init(data);
		for(int i = 0; i < data.length; i++)
			heap.remove();
		System.arraycopy(heap.queue, 1, data, 0, data.length);
	}

	private static class MaxHeap{
        
        
        void init(int[] data){
            this.queue=new int[data.length+1];
            for(int i=0;i<data.length;i++){
                queue[++size]=data[i];
                fixUp(size);
            }
        }
          
        private int size=0;
 
        private int[] queue;
                 
        public int get() {
            return queue[1];
        }
 
        public void remove() {
            Sort.swap(queue,1,size--);
            fixDown(1);
        }
        //fixdown
        private void fixDown(int k) {
            int j;
            while ((j = k << 1) <= size) {
                if (j < size && queue[j]<queue[j+1])
                    j++; 
                if (queue[k]>queue[j]) //不用交换
                    break;
                Sort.swap(queue,j,k);
                k = j;
            }
        }
        private void fixUp(int k) {
            while (k > 1) {
                int j = k >> 1;
                if (queue[j]>queue[k])
                    break;
                Sort.swap(queue,j,k);
                k = j;
            }
        }
 
    }
	
}

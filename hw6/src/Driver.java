import java.util.Random;
public class Driver {
    public static void main(String[] args) throws Exception {
        
        Integer[] myArray1 = new Integer[100];
        Integer[] myArray2 = new Integer[1000];
        Integer[] myArray3 = new Integer[10000];
        
        HashTableBST<Integer, Integer> myHash = new HashTableBST<>();

        int y;
        Random rand = new Random(); 
        int upperbound = 150;
        int int_random;
        Integer[] temp1 = new Integer[100];
        Integer[] temp12 = new Integer[100];
        Integer[] temp2 = new Integer[1000];
        Integer[] temp22 = new Integer[1000];
        Integer[] temp3 = new Integer[10000];
        Integer[] temp32 = new Integer[10000];
        long merge100=0;
        long quick100=0;
        long new100=0;
        long merge1000=0;
        long quick1000=0;
        long new1000=0;
        long merge10000=0;
        long quick10000=0;
        long new10000=0;
        long start;
        long end;
        long time;

        long put100=0;
        long put1000=0;
        long put10000=0;
        long get100=0;
        long get1000=0;
        long get10000=0;
        long remove100=0;
        long remove1000=0;
        long remove10000=0;

        
        for(int x=0; x<100; x++){
            start = System.nanoTime();
            for(int i=0; i<100; i++){
                try{myHash.put(i, i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            put100 = put100 + (end-start);
        }

        System.out.println("Average running time for put operation with size 100: " + put100/100);

        
        for(int x=0; x<100; x++){
            start = System.nanoTime();
            for(int i=0; i<1000; i++){
                try{myHash.put(i, i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            put1000 = put1000 + (end-start);
        }
        

        System.out.println("Average running time for put operation with size 1000: " + put1000/100);

        
        for(int x=0; x<100; x++){
            start = System.nanoTime();
            for(int i=0; i<10000; i++){
                try{myHash.put(i, i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            put10000 = put10000 + (end-start);
        }
        

        System.out.println("Average running time for put operation with size 10000: " + put10000/100);

        for(int x=0; x<100; x++){
            start= System.nanoTime();
            for(int i=0; i<100; i++){
                try{myHash.get(i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            get100 = get100 + (end-start);
        }
        

        System.out.println("Average running time for get operation with size 1000: " + get100/100);

        
        for(int x=0; x<100; x++){
            start= System.nanoTime();
            for(int i=0; i<1000; i++){
                try{myHash.get(i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            get1000 = get1000 + (end-start);
        }
        

        System.out.println("Average running time for get operation with size 1000: " + get1000/100);

        for(int x=0; x<100; x++){
            start= System.nanoTime();
            for(int i=0; i<10000; i++){
                try{myHash.get(i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            get10000 = get10000 + (end-start);
        }
        

        System.out.println("Average running time for get operation with size 10000: " + get10000/100);

        
        for(int x=0; x<100; x++){
            start = System.nanoTime();
            for(int i=0; i<100; i++){
                try{myHash.remove(i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            remove100 = remove100 + (end-start);
        }
        

        System.out.println("Average running time for remove operation with size 100: " + remove100/100);

        for(int x=0; x<100; x++){
            start = System.nanoTime();
            for(int i=0; i<1000; i++){
                try{myHash.remove(i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            remove1000 = remove1000 + (end-start);
        }
        

        System.out.println("Average running time for remove operation with size 1000: " + remove1000/100);


        for(int x=0; x<100; x++){
            start = System.nanoTime();
            for(int i=0; i<10000; i++){
                try{myHash.remove(i);}catch(ClassCastException e){}
            }
            end = System.nanoTime();
            remove10000 = remove10000 + (end-start);
        }
        

        System.out.println("Average running time for remove operation with size 10000: " + remove10000/100);
        
        for(y=0; y<10; y++){
            for(int i=0; i<100; i++){
                int_random = rand.nextInt(upperbound);
                myArray1[i] = int_random;
            }
            temp1 = myArray1;
            temp12 = myArray1;

            start = System.nanoTime();
            MergeSort.sort(myArray1, 0, myArray1.length-1);
            end = System.nanoTime();
            time = end-start;
            merge100 = merge100+time;

            start = System.nanoTime();
            QuickSort.sort(temp1, 0, temp1.length-1);
            end = System.nanoTime();
            time = end-start;
            quick100 = quick100+time;

            start = System.nanoTime();
            QuickSort.sort(temp12, 0, temp12.length);
            end = System.nanoTime();
            time = end-start;
            new100 = new100+time;
        }

        merge100=merge100/100;
        quick100=quick100/100;
        new100=new100/100;

        upperbound = 1500;
        for(y=0; y<10; y++){
            for(int i=0; i<1000; i++){
                int_random = rand.nextInt(upperbound);
                myArray2[i] = int_random;
            }
            temp2 = myArray2;
            temp22 = myArray2;

            start = System.nanoTime();
            MergeSort.sort(myArray2, 0, myArray2.length-1);
            end = System.nanoTime();
            time = end-start;
            merge1000 = merge1000+time;

            start = System.nanoTime();
            QuickSort.sort(temp2, 0, temp2.length-1);
            end = System.nanoTime();
            time = end-start;
            quick1000 = quick1000+time;

            start = System.nanoTime();
            QuickSort.sort(temp22, 0, temp22.length);
            end = System.nanoTime();
            time = end-start;
            new1000 = new1000+time;
        }

        merge1000=merge1000/100;
        quick1000=quick1000/100;
        new1000=new1000/100;

        upperbound = 15000;
        for(y=0; y<10; y++){
            for(int i=0; i<10000; i++){
                int_random = rand.nextInt(upperbound);
                myArray3[i] = int_random;
            }
            temp3 = myArray3;
            temp32 = myArray3;

            start = System.nanoTime();
            MergeSort.sort(myArray3, 0, myArray3.length-1);
            end = System.nanoTime();
            time = end-start;
            merge10000 = merge10000+time;

            start = System.nanoTime();
            QuickSort.sort(temp3, 0, temp3.length-1);
            end = System.nanoTime();
            time = end-start;
            quick10000 = quick10000+time;

            start = System.nanoTime();
            QuickSort.sort(temp32, 0, temp32.length);
            end = System.nanoTime();
            time = end-start;
            new10000 = new10000+time;
        }

        merge10000=merge10000/100;
        quick10000=quick10000/100;
        new10000=new10000/100;

        System.out.println("Average running time for Mergesort with size 100: " + merge100 + "\nwith size 1000: " + merge1000 + "\nwith size 10000: " + merge10000);
        System.out.println("Average running time for Quicksort with size 100: " + quick100 + "\nwith size 1000: " + quick1000 + "\nwith size 10000: " + quick10000);
        System.out.println("Average running time for Newsort with size 100: " + new100 + "\nwith size 1000: " + new1000 + "\nwith size 10000: " + new10000);

    }
}

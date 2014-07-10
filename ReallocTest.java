/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realloctest;

/**
 *
 * @author francisco
 */
public class ReallocTest {

    /**
     * @param args the command line arguments
     */
    
    public int[] JRealloc(int starter[]){
        int oldsize = starter.length;
        int newsize = oldsize + 1;
        oldsize--; //para ter o indice do ultimo endereço do array 
        
        int[] augmentedArray = new int[newsize];
        
        for(int i=0; i <= oldsize; ++i)
        {
            augmentedArray[i] = starter[i];
        }
        
        augmentedArray[(newsize-1)] = 0;
        
        return augmentedArray;
    }
    
    public static void main(String[] args) {
        int[] data1 = new int[] { 1, 3, 5, 7, 9 };
        
        System.out.println("Array orignial:"+data1.length+" elementos.");
        System.out.println("\n");
        for(int i = 0; i < data1.length; ++i)
        {
            System.out.println("elemento:"+i+" valor: "+data1[i]);
        }
        
        System.out.println("\n\n\n");
        
        ReallocTest test = new ReallocTest();
        data1 = test.JRealloc(data1);
        System.out.println("Array aumentado:"+data1.length+" elementos.");
        System.out.println("\n");
        
        
        data1[(data1.length)-1] = 5;
        
        for(int i = 0; i < data1.length; ++i)
        {
            System.out.println("elem:"+i+" valor: "+data1[i]);
        }
    }
}

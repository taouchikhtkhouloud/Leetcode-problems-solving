class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
     
         if(m==0 ){
              for(int j=0 ; j<n ; j++){
                nums1[j]=nums2[j];
                
               }
                                    
          }  
          else{    
       while(n!=0 ){
                            
                if(m==0 ){
             
                nums1[n+m-1]=nums2[n-1];
                n--;
                
               
                                    
          }      
          else{

                if(nums1[m-1] > nums2[n-1]){
                    nums1[n+m-1]=nums1[m-1];
                    nums1[m-1]=0;
                    m--;
                }
                else{
                    nums1[n+m-1]=nums2[n-1];
                        n--;
                }
          }           

         }
       }
        }
     

    
}
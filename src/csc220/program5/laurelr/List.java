/* CSC 220 Program 5
 * Regan Laurell
 * May 3, 2017
 * Description: This class implements the remove and addBeforeNext method of the 
                List class.
 * Acknowledgements: To complete this project I had assistance from programming
 *                   consualtants and class examples.
 * Notes: In order to remove the GameCharacter the points have to be removed in order.
*/

package csc220.program5.laurelr;
import csc220.list.AddIterator;
import csc220.list.Node;

public class List<E> extends csc220.list.List<E> { 
       
   @Override
   public AddIterator<E> addIterator(){return new ListAddIterator<>();}
   
   
   //  This nested class replaces the one in csc220.list.List
   protected class ListAddIterator<T extends E> extends csc220.list.List<E>.ListAddIterator<E> {
       
       private static final boolean DEBUGGING = true;
      
        protected Node<E> prevNode = null;
        
        @Override
        public E next() {
            prevNode = nextNode;
            return super.next();
        }

        // For debugging purposes.
        private void printNodes(String s) {
            if (!DEBUGGING)
                return;
            System.out.print(s);
            if (prevNode != null) {
                //System.out.print(" --previous data = " + prevNode.data);
            }
            if (nextNode != null) {
                //System.out.print("\nNEXT NODE -" + nextNode.data + "\nFIRST NODE -" + first.data + "\nPREV NODE -" + prevNode.data + "\nLAST NODE -" + last.data);   //100, 50 xy     
            }
            if( nextNode == null){
                System.out.println(" it's null ");
            }
            System.out.println("");
        }
        
        @Override 
        public void addBeforeNext(E e) {
            Node<E> tmp = new Node<>();
            tmp.data = e;
            
            if (nextNode != null) {
                if(first.data.equals(nextNode.data)){    // just goes back and forth two points
                    first.next = tmp;
                    tmp.next = nextNode;
                }
                else{ 
                    prevNode.next = tmp; 
                    tmp.next = nextNode;
                }
            }else{ 
                prevNode.next = tmp;
                tmp.next = nextNode;
            }
        }
        
        @Override
        public void remove() {
            printNodes("(laurelr)Remove clicked");
            Node<E> tmp = new Node<>();
            while(tmp !=prevNode){
                tmp = prevNode;   
            }
            if(prevNode == nextNode){
                tmp.next = nextNode;
                prevNode = null;
            }
            if(first == prevNode){
                first = prevNode.next;
                prevNode = null;
            }
            if(last == prevNode){
                last = nextNode;
                prevNode = null;
            }
        }
     }
   
   
}

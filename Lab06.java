/**
*
* @author <Jordan Koski>  // 
* @version <12th November> // 
*/


   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    public class Lab06
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_01(); 
         task_02(); 
         task_03(); 
         task_04(); 
         task_05(); 
         task_06(); 
      }
       public static void task_01()	
      { 
         while (temp.nextToABeeper())            
         {                          
         temp.move();                      
         }
         
         
         Robot temp = new Robot(1, 1, Display.EAST, 0);
      
      }
       public static void task_02()	
      { 
         while (!temp.nextToABeeper())
         {
         temp.move();
         }
   
         Robot temp = new Robot(1, 2, Display.EAST, 0);
      	
      }
       public static void task_03()	
      { 
         while (temp.frontIsClear())
         {
         temp.move();
         }
         
         Robot temp = new Robot(1, 3, Display.EAST, 0);
       
      }
       public static void task_04()	
      { 
         while (temp.frontIsClear())
         {
         if (temp.nextToABeeper()){
               temp.pickBeeper();
               temp.move();
         } else {
         temp.move();
         }
         }
         while (!temp.frontIsClear()&&temp.nextToABeeper()){
         temp.pickBeeper();
         }
         Robot temp = new Robot(1, 4, Display.EAST, 0);
      
      }
       public static void task_05()	
       {   
         while (temp.nextToABeeper())
         {
               temp.pickBeeper();
         }
         
         else if (!temp.nextToABeeper())
         {
               temp.move();
         }
         
         Robot temp = new Robot(1, 5, Display.EAST, 0);
         
      
      }
       public static void task_06()
      { 
      
         while (temp.nextToABeeper()&&temp.frontIsClear())
         {
         temp.move();
         }
         
         Robot temp = new Robot(1, 6, Display.EAST, 0);
      
      }
   }






  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(400,200);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();

}
int overallSpeed = 1;
int circleX1 = 100;
int circleX2 = 300;
int speed = overallSpeed;
int speed2 = -overallSpeed;
void draw() {
  
background(#B4B4B4);

        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
for(int i = 1; i<150;i++){
  ellipse(circleX1,100,i,i);
  ellipse(circleX2,100,i,i);
  i=i+5;
}
circleX1 = circleX1 + speed;
circleX2 = circleX2 + speed2;
if(circleX1>400){
  speed = -speed;
}
if(circleX1<0){
  speed = -speed;
}

if(circleX2>400){
  speed2 = -speed2;
}
if(circleX2<0){
  speed2 = -speed2;
}




        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
 
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */

         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}

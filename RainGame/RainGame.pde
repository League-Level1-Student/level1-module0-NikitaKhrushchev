int y = 0;
int bucketY = 0;
int x =(int) random(700) + 50;
int score = 0;
int speed = (int) random(15);
PImage image;
PImage waterDrop;
void setup(){
  size(800, 800);
  image = loadImage("download.png");
  image.resize(40,40);
  waterDrop = loadImage("w.png");
  waterDrop.resize(30,30);
}
void draw(){
background(0,0,250);
textSize(300);
text(score,500,500);
bucketY = yLoc();
image(image,mouseX-20,bucketY);
y += speed;
    fill(0, 0, 50);
    stroke(0, 0, 125);
    image(waterDrop,x, y);
boolean caughtit = checkLoc(x,y,mouseX,bucketY);
if (caughtit == true){
  score += 1;
  y = 0;
  speed = (int) random(15);
x = (int) random(700)+50;

}
if (y > 790){
  print("3414");
y = 0;
x = (int) random(700) + 50;
score -= 1;
speed = (int) random(15) + 1;
}
}
int yLoc(){
  if(mouseY > 500){
  return mouseY-20;
  }
  else{
return 480;
  }
}
boolean checkLoc(int bx, int by, int mx, int my){
 if (mousePressed == true){
   mousePressed = false;
 }
if ((((bx < mx + 30) && (bx > mx - 30))) &&((by < my + 10)&&(by>my-30))) {
  return true;
  
}
else{
return false;
}
}

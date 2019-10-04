int x = 200;
int y = 500;
int bX = 200;
boolean yDir = true;
boolean xDir = true;
int a = 5;
int l = 0;
int l2 = 0;
int l3 = 0;
int phrase = 0;
String a1 = "This";
String a2 = "took";
String a3 = "too";
String a4 = "long";
String a5 = "to";
String a6 = "make";
void setup(){
size(400,1000);
background(0,0,0);
}
void draw(){
  
  if (xDir == true){
    x += a;
    if (x>394){
    xDir = false;
    l = (int)random(0,255);
  l2 = (int)random(0,255);
  l3 = (int)random(0,255); 
  phrase += 1;
  if (phrase == 6){
  phrase = 0;
  }
    }
  }
  if (xDir == false){
  x -= a;
  if (x< 6){
  xDir = true; 
  l = (int)random(0,255);
  l2 = (int)random(0,255);
  l3 = (int)random(0,255);  
  phrase += 1;
  if (phrase == 6){
  phrase = 0;
  }
  }
  }
  
  
  
  
  
  

//  if (mousePressed == true){
 // print(((x < mouseX + 30) && (x > mouseX - 30)),((y < 980) && (y > 0)));
//  mousePressed = false;
 // }
  bX = mouseX-20;
  if (mousePressed == true){
   
}
  background(l,l2,l3);
  textSize(32);
  fill(0,0,0);
  if (phrase == 0){
  text(a1,200,60);
  }
  if (phrase == 1){
  text(a2,200,320);
  }
  if (phrase == 2){
  text(a3,200,480);
  }
  if (phrase == 3){
  text(a4,200,640);
  }
  if (phrase == 4){
  text(a5,200,800);
  }
  if (phrase == 5){
  text(a6,200,960);
  }
fill(250,0,0);
stroke(0,0,250);
ellipse(x,y,20,20);
if (y < 5){
yDir = true;
l = (int)random(0,255);
  l2 = (int)random(0,255);
  l3 = (int)random(0,255);  
  phrase += 1;
  if (phrase == 6){
  phrase = 0;
  }
}
if (y> 995){
yDir = false;
l = (int)random(0,255);
  l2 = (int)random(0,255);
  l3 = (int)random(0,255);  
  phrase += 1;
  if (phrase == 6){
  phrase = 0;
  }
}
if (yDir == false){
y = y-1;
}
if (yDir == true){
y = y+1;
if (checkLoc(x,y) == true){
yDir = false;

  phrase += 1;
  if (phrase == 6){
  phrase = 0;
  }
}
}


fill(0,250,0);
rect(bX,980, 40,10);
}


boolean checkLoc(int ballX, int ballY){
  
  if (((ballX < mouseX + 30) && (ballX > mouseX - 30)) && ((ballY < 980) && (ballY > 960))) {
  return true;
  }
  else{
  return false;
  }
}

int x =200;
int y = 200;
Boolean hDir = true;
Boolean vDir = true;
int spd = 2;
int xspd = 1;
int [] bList = new int[40];
void setup(){
size(400,400);
background(0,0,120);
for (int l = 1;l<36;l+=1){
bList[l] = 1;
}

}
void draw(){
int blockX = mouseX-20;
background(0,0,120);


if (x < 1){
  hDir = true;
  xspd = (int)random(10);
}
if (x>399){
hDir = false;
xspd = (int)random(10);
}
if (hDir == true){
  x+=xspd;
}
if (hDir == false ){
x-=xspd;
}
if (vDir == true){
y+=spd;
if ((x < blockX + 30) && (x>blockX-30)){
  if ((y<390)&&(y>380)){
 // print((y<390)&&(y>380),"\n");
  }
if ((y<390)&&(y>380)){
vDir = false;
xspd = (int)random(10);
}
}
}
if (vDir == false){
  y-=spd;
  if (y < 2){
    xspd = (int)random(10);
  vDir = true;
  }
}

fill(0,125,0);
for(int i = 0; i<4;i+=1){
for(int j = 0; j<9;j+=1){
  if (bList[(5*i)+(j)] == 1){
rect(20+(40*j),20+(40*i),20,20);
  }
if ((y<30+(40*i))&&(y>10+(40*i))){
if ((x<30+(40*j))&&(x>10+(40*j))){  
  bList[(9*i)+j-1] = 0;
}
}
}
}
fill(0,250,0);
stroke(0,0,0);
ellipse(x,y,10,10);
//rect(20,20,20,20);
fill(250,0,0);
rect(blockX,385,40,10);
}

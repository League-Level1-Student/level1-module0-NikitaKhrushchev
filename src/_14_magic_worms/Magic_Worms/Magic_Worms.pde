int[] lx = new int[20];
int[] ly = new int[20];
void setup(){
  size(360,360);
  background(0,0,0);
  for(int i = 0; i<20;i+=1){
  for(int j = 0; j<20;j+=1){
  lx[i] = (int)random(360);
  ly[j] = (int)random(360);
  }
  }
}
void draw(){
  background(0,0,0);
  for (int x = 0; x<20;x+=1){ 
    for (int y = 0; y<20;y+=1){ 
    fill(250,0,0);
    ellipse(lx[x],ly[y],10,10);
    if (lx[x]>10){ 
    
    if (lx[x] < 350){
      lx[x]+=1;
    }
    else{
    lx[x] -= 1;
    }
    }
    
}
}
}

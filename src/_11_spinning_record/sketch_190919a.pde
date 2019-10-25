import ddf.minim.*;     
Minim minim;        //as a member variable
AudioPlayer song;
PImage pictureOfRecord;      
int rotateAmount = 0; //as member variable
      //as a member variable

void setup(){
        minim = new Minim(this);    //in the setup method
        song = minim.loadFile("awesomeTrack.mp3", 512);
        size(256,194);       
        //in setup method
        //pictureOfRecord.resize(600,600);   
        pictureOfRecord= loadImage("record.png");      //in setup method
}
void draw(){
  if (mousePressed == true){
  rotateAmount += 1;
  rotateImage(pictureOfRecord, rotateAmount);
  image(pictureOfRecord, 0, 0);  //in draw method
  song.play();
  }
  song.pause();
}
 void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }

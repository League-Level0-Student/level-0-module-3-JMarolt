PImage donkey;
PImage tail;

int x = mouseX;
int y = mouseY;
boolean fixed = false;

void setup() {

  size(2088, 1666);
  donkey = loadImage("DonkeyPicture.jpg");



  tail = loadImage("donkey tail.png");
}
void draw() {
  if (mouseX < 100 && mouseY < 100) {
    background(donkey);
  } else {
    background(0, 0, 0);
  }
  if (fixed) {
    background(donkey);
    image(tail, x, y);
    textSize(32);
    fill(0, 0, 0);
    if (isNear(x, 345)&& isNear(y, 739)) {


      text("You win!", 40, 40);
    } else {

      text("You Lose!", 40, 40);
    }
  } else {
    image(tail, mouseX, mouseY);
  }

  if (mousePressed && ! fixed) {
    fixed = true;
    //x = 345  y = 739
    x = (mouseX);
    y = (mouseY);

    //rect(345,739,10,10);
  }
}
boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
    return true;
  else
    return false;
}
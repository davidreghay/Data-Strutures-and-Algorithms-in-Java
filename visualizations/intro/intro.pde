int[] integers = new int[20];

void setup() {
  size(600, 600);
  for (int i = 0; i < integers.length; i++) {
    integers[i] = (int) random(200);
  }

  noLoop();
}

void draw() {
  for (int i = 0; i < integers.length; i++) {
    fill(201 - integers[i], 20 + integers[i], integers[i]);
    rect(i * 20, 600 - integers[i], 15, integers[i]);
  }
}

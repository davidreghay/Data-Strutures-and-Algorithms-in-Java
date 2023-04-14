int[] integers = new int[200];

void setup() {
  size(1400, 600);
  for (int i = 0; i < integers.length; i++) {
    integers[i] = (int) random(200);
  }

  noLoop();
}

void draw() {
  for (int i = 0; i < integers.length; i++) {
    fill(201 - integers[i], 20 + integers[i], integers[i]);
    rect(i * 7, 600 - integers[i], 7, integers[i]);
  }
}

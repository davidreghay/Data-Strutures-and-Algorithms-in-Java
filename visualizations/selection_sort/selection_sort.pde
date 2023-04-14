int[] integers = new int[200];
int sortIndex = 0;

void setup() {
  size(1400, 600);
  for (int i = 0; i < integers.length; i++) {
    integers[i] = (int) random(200);
  }
  frameRate(4);
  loop();
}

void swap(int[] a, int i, int j) {
  int tmp = a[i];
  a[i] = a[j];
  a[j] = tmp;
}

void draw() {
  background(200);
  for (int i = 0; i < integers.length; i++) {
    fill(201 - integers[i], 20 + integers[i], integers[i], i >= sortIndex ? 70 : 255);
    rect(i * 7, 600 - integers[i], 7, integers[i]);
  }

  if (sortIndex < integers.length) {
    int smallest = sortIndex;
    for (int i = sortIndex + 1; i < integers.length; i++) {
      if (integers[i] < integers[smallest]) {
        smallest = i;
      }
    }


    swap(integers, sortIndex, smallest);
    sortIndex++;
  } else if (sortIndex > integers.length) {
    noLoop();
  }
}


int main(int argc, char** argv){
  char blocks[3] = {'A', 'B', 'C'}; /* assume this starts at 2000 */
  char *ptr = &blocks[0];
  char temp = 'A';

  temp = blocks[0];
  temp = *(blocks + 2);
  temp = *(ptr + 1);
  temp = *ptr;

  ptr = blocks + 1;
  temp = *ptr;
  temp = *(ptr + 1);

  ptr = blocks;
  temp = *++ptr;
  temp = ++*ptr;
  temp = *ptr++;
  temp = *ptr;

  return 0;
}

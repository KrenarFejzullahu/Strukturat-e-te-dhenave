/** Box models a box in which moving objects live */
public class Box
{ private int box_size; // the size of the box
/** Constructor Box builds the box
* @param size - the size of the box */
public Box(int size)
{ box_size = size; }
/** inHorizontalContact replies whether a position has contacted a
* horizontal wall.
* @param x position - the position examined
* @return true, if x position equals or exceeds the positions of the
* horizontal walls; return false, otherwise */
public boolean inHorizontalContact(int x_position)
{ return (x_position <= 5 ) || (x_position >= (box_size-5)); }
/** inVerticalContact replies whether a position has contacted a
* vertical wall.
* @param y position - the position examined
* @return true, if y position equals or exceeds the positions of the
* vertical walls; return false, otherwise */
public boolean inVerticalContact(int y_position)
{ return (y_position <= 5 ) || (y_position >= (box_size-5)); }
/** sizeOf returns the size of the box */
public boolean neKH(int x_position)
{ return (x_position >=93 ) && (x_position <= 107); }

public boolean neKV(int y_position)
{ return (y_position >= 65) && (y_position <= 115); }

public int sizeOf()
{ return box_size; }
}
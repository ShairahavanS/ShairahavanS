/**
* Names:  Larry Li
          Shairahavan Selvachandran
          Kevin Yao
          Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled (very bare bones).
*/

public class Character {
    private int height, width, length, hitpoints;
    private int coordinateX, coordinateY, coordinateZ; //centre of character
    
    public Character(int coordinateX, int coordinateY, int coordinateZ, int hitpoints, int height, int width, int length) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.hitpoints = hitpoints;
        this.height = height;
        this.width = width;
        this.length = length;
    }
    
    //Getter methods
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getZ() {
        return this.z;
    }
    
    public int getHp() {
        return this.hp;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }
    
    public String getType() {
        return this.type;
    }
    
    //Setter methods
    public void setXAxis(int newX) {
        this.x += newX;
    }
    
    public void setYAxis(int newY) {
        this.y += newY;
    }
    
    public void setZAxis(int newZ) {
        this.z += newZ;
    }
    
    public void setSize(int newHeight, int newWidth, int newLength) {
        this.height += newHeight;
        this.width += newWidth;
        this.length += newLength;
    }
    
    public void setType(String newType) {
        this.type = newType;
    }
    
    public void setHP(int newHP) {
        int health = this.hp = newHP;
        if (health < 0) { //Killing the user if they have no hp
            health = 0;
            this.die("No hp"); 
        }
    }
            
    //Other methods
    public void noise() { //making noise
        System.out.println("Noise");
    }
    
    /**
     *
     * @return
     */
    public String toString() { //Outputting stats
        String ret = "x: " + this.x + " y: " + this.y + " z: " + 
                    this.z + "\nHeight: " + this.height + " Width:" +
                    this.width + " Length: " + this.length +"\nHP: "
                    + this.hp + " Type: " + this.type;
        return ret;
    }
    
    public void die(String reason) { //User dies from the specified reason
        System.out.println(this.type + " died from " + reason);
        System.exit(0);
    }
}
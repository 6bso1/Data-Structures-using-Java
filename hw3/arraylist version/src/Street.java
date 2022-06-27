import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * All the major activities are performed under this class
 */
public class Street {
    private int length1;
    private int length2;
    private int length;
    private int total=0;
    private int index1=0;
    private int index2=0;
    private int side1[][] = new int[100][3];
    private int side2[][] = new int[100][3];
    
    private ArrayList<House> houses1;
    private ArrayList<House> houses2;
    private ArrayList<Office> offices1;
    private ArrayList<Office> offices2;
    private ArrayList<Market> markets1;
    private ArrayList<Market> markets2;
    private ArrayList<Playground> playgrounds1;
    private ArrayList<Playground> playgrounds2;
/**
 * This constructor sets the length of the street which is given by user
 *  And creates all the necessary arrays
 * @param length
 */
    public Street(int length){
        this.length1 = length;
        this.length2 = length;
        this.length = length;

        this.houses1 = new ArrayList<>();
        this.houses2 = new ArrayList<>();
        this.offices1 = new ArrayList<>();
        this.offices2 = new ArrayList<>();
        this.markets1 = new ArrayList<>();
        this.markets2 = new ArrayList<>();
        this.playgrounds1 = new ArrayList<>();
        this.playgrounds2 = new ArrayList<>();

    }
/**
 * This function adds the given House object to side 1 of the street, if it fits
 * @param house
 */
    public void addHouseSide1(House house){
        int control=0;
        int startPosBuil = house.getPosition();
        int endPosBuil = house.getPosition() + house.getLength();
        int startPosTemp;
        int endPosTemp;

        if((house.getPosition()+house.getLength() > getLength()) || (house.getPosition() <= 0) ||
        (house.getLength() <= 0) || (house.getHeight() <= 0)){
            System.out.println("The values you entered are invalid, house not added.");
        }

        else{
            for(int i=0; i<index1; i++){
                startPosTemp = side1[i][0];
                endPosTemp = side1[i][0] + side1[i][1];
                if(!(endPosBuil < startPosTemp || startPosBuil > endPosTemp)){
                    control = 1;
                }
            }

            if(control == 1){
                System.out.println("This land is occupied, you cannot add house");
            }
            else{
                this.houses1.add(house);
                this.length1 = this.length1 - house.getLength();
                this.total += house.getLength();
                this.side1[index1][0] = house.getPosition();
                this.side1[index1][1] = house.getLength();
                this.side1[index1][2] = house.getHeight();
                this.index1++;
                System.out.println("House added successfully!");
            }
        }
    };
/**
 * This function adds the given House object to side 2 of the street, if it fits
 * @param house
 */
    public void addHouseSide2(House house){
        int control=0;
        int startPosBuil = house.getPosition();
        int endPosBuil = house.getPosition() + house.getLength();
        int startPosTemp;
        int endPosTemp;

        if((house.getPosition()+house.getLength() > getLength()) || (house.getPosition() <= 0) ||
        (house.getLength() <= 0) || (house.getHeight() <= 0)){
            System.out.println("The values you entered are invalid, house not added.");
        }

        else{
            for(int i=0; i<index2; i++){
                startPosTemp = side2[i][0];
                endPosTemp = side2[i][0] + side2[i][1];
                if(!(endPosBuil < startPosTemp || startPosBuil > endPosTemp)){
                    control = 1;
                }
            }

            if(control == 1){
                System.out.println("This land is occupied, you cannot add house");
            }
            else{
                this.houses2.add(house);
                this.length2 = this.length2 - house.getLength();
                this.total += house.getLength();
                this.side2[index2][0] = house.getPosition();
                this.side2[index2][1] = house.getLength();
                this.side2[index2][2] = house.getHeight();
                this.index2++;
                System.out.println("Building added successfully!");
            }
        }
    };
/**
 * This function adds the given Office object to side 1 of the street, if it fits
 * @param office
 */
    public void addOfficeSide1(Office office){
        int control=0;
        int startPosBuil = office.getPosition();
        int endPosBuil = office.getPosition() + office.getLength();
        int startPosTemp;
        int endPosTemp;

        if((office.getPosition()+office.getLength() > getLength()) || (office.getPosition() <= 0) ||
        (office.getLength() <= 0) || (office.getHeight() <= 0)){
            System.out.println("The values you entered are invalid, office not added.");
        }

        else{
            for(int i=0; i<index1; i++){
                startPosTemp = side1[i][0];
                endPosTemp = side1[i][0] + side1[i][1];
                if(!(endPosBuil < startPosTemp || startPosBuil > endPosTemp)){
                    control = 1;
                }
            }

            if(control == 1){
                System.out.println("This land is occupied, you cannot add office");
            }
            else{
                this.offices1.add(office);
                this.length1 = this.length1 - office.getLength();
                this.total += office.getLength();
                this.side1[index1][0] = office.getPosition();
                this.side1[index1][1] = office.getLength();
                this.side1[index1][2] = office.getHeight();
                this.index1++;
                System.out.println("Office added successfully!");
            }
        }
    };
/**
 * This function adds the given Office object to side 2 of the street, if it fits
 * @param office
 */
    public void addOfficeSide2(Office office){
        int control=0;
        int startPosBuil = office.getPosition();
        int endPosBuil = office.getPosition() + office.getLength();
        int startPosTemp;
        int endPosTemp;

        if((office.getPosition()+office.getLength() > getLength()) || (office.getPosition() <= 0) ||
        (office.getLength() <= 0) || (office.getHeight() <= 0)){
            System.out.println("The values you entered are invalid, office not added.");
        }

        else{
            for(int i=0; i<index2; i++){
                startPosTemp = side2[i][0];
                endPosTemp = side2[i][0] + side2[i][1];
                if(!(endPosBuil < startPosTemp || startPosBuil > endPosTemp)){
                    control = 1;
                }
            }

            if(control == 1){
                System.out.println("This land is occupied, you cannot add office");
            }
            else{
                this.offices2.add(office);
                this.length2 = this.length2 - office.getLength();
                this.total += office.getLength();
                this.side2[index2][0] = office.getPosition();
                this.side2[index2][1] = office.getLength();
                this.side2[index2][2] = office.getHeight();
                this.index2++;
                System.out.println("Office added successfully!");
            }
        }
    };
/**
 * This function adds the given Market object to side 1 of the street, if it fits
 * @param market
 */
    public void addMarketSide1(Market market){
        int control=0;
        int startPosBuil = market.getPosition();
        int endPosBuil = market.getPosition() + market.getLength();
        int startPosTemp;
        int endPosTemp;

        if((market.getPosition()+market.getLength() > getLength()) || (market.getPosition() <= 0) ||
        (market.getLength() <= 0) || (market.getHeight() <= 0)){
            System.out.println("The values you entered are invalid, market not added.");
        }

        else{
            for(int i=0; i<index1; i++){
                startPosTemp = side1[i][0];
                endPosTemp = side1[i][0] + side1[i][1];
                if(!(endPosBuil < startPosTemp || startPosBuil > endPosTemp)){
                    control = 1;
                }
            }

            if(control == 1){
                System.out.println("This land is occupied, you cannot add market");
            }
            else{
                this.markets1.add(market);
                this.length1 = this.length1 - market.getLength();
                this.total += market.getLength();
                this.side1[index1][0] = market.getPosition();
                this.side1[index1][1] = market.getLength();
                this.side1[index1][2] = market.getHeight();
                this.index1++;
                System.out.println("Market added successfully!");
            }
        }
    };
/**
 * This function adds the given Market object to side 2 of the street, if it fits
 * @param market
 */
    public void addMarketSide2(Market market){
        int control=0;
        int startPosBuil = market.getPosition();
        int endPosBuil = market.getPosition() + market.getLength();
        int startPosTemp;
        int endPosTemp;

        if((market.getPosition()+market.getLength() > getLength()) || (market.getPosition() <= 0) ||
        (market.getLength() <= 0) || (market.getHeight() <= 0)){
            System.out.println("The values you entered are invalid, market not added.");
        }

        else{
            for(int i=0; i<index2; i++){
                startPosTemp = side2[i][0];
                endPosTemp = side2[i][0] + side2[i][1];
                if(!(endPosBuil < startPosTemp || startPosBuil > endPosTemp)){
                    control = 1;
                }
            }

            if(control == 1){
                System.out.println("This land is occupied, you cannot add market");
            }
            else{
                this.markets2.add(market);
                this.length2 = this.length2 - market.getLength();
                this.total += market.getLength();
                this.side1[index2][0] = market.getPosition();
                this.side1[index2][1] = market.getLength();
                this.side1[index2][2] = market.getHeight();
                this.index2++;
                System.out.println("Market added successfully!");
            }
        }
    };

/**
 * This function adds the given Playground object to side 1 of the street, if it fits
 * @param playground
 */
    public void addPlaygroundSide1(Playground playground){
        int control=0;
        int startPosBuil = playground.getPosition();
        int endPosBuil = playground.getPosition() + playground.getLength();
        int startPosTemp;
        int endPosTemp;

        if((playground.getPosition()+playground.getLength() > getLength()) || (playground.getPosition() <= 0) ||
        (playground.getLength() <= 0)){
            System.out.println("The values you entered are invalid, playground not added.");
        }

        else{
            for(int i=0; i<index1; i++){
                startPosTemp = side1[i][0];
                endPosTemp = side1[i][0] + side1[i][1];
                if(!(endPosBuil < startPosTemp || startPosBuil > endPosTemp)){
                    control = 1;
                }
            }

            if(control == 1){
                System.out.println("This land is occupied, you cannot add playground");
            }
            else{
                this.playgrounds1.add(playground);
                this.length1 = this.length1 - playground.getLength();
                this.side1[index1][0] = playground.getPosition();
                this.side1[index1][1] = playground.getLength();
                this.side1[index1][2] = 0;
                this.index1++;
                System.out.println("Playground added successfully!");
            }
        }
    };
/**
 * This function adds the given Playground object to side 2 of the street, if it fits
 * @param playground
 */
    public void addPlaygroundSide2(Playground playground){
        int control=0;
        int startPosBuil = playground.getPosition();
        int endPosBuil = playground.getPosition() + playground.getLength();
        int startPosTemp;
        int endPosTemp;

        if((playground.getPosition()+playground.getLength() > getLength()) || (playground.getPosition() <= 0) ||
        (playground.getLength() <= 0)){
            System.out.println("The values you entered are invalid, playground not added.");
        }

        else{
            for(int i=0; i<index2; i++){
                startPosTemp = side2[i][0];
                endPosTemp = side2[i][0] + side2[i][1];
                if(!(endPosBuil < startPosTemp || startPosBuil > endPosTemp)){
                    control = 1;
                }
            }

            if(control == 1){
                System.out.println("This land is occupied, you cannot add playground");
            }
            else{
                this.playgrounds2.add(playground);
                this.length2 = this.length2 - playground.getLength();
                this.side2[index2][0] = playground.getPosition();
                this.side2[index2][1] = playground.getLength();
                this.side2[index2][2] = 0;
                this.index2++;
                System.out.println("Playground added successfully!");
            }
        }
    };
/**
 * This function removes the given House object from the side 1 of the street
 * @param house
 */
    public void deleteHouseSide1(House house){
        for(int i=0; i<this.index1; i++)
        {
            if(this.side1[i][0]==house.getPosition())
            {
                for(int j=i; j<this.index1; j++){
                    this.side1[j][0] = this.side1[j+1][0];
                    this.side1[j][1] = this.side1[j+1][1];
                    this.side1[j][2] = this.side1[j+1][2];
                }
                this.index1--;
            }
        }
        this.total = this.total - house.getLength();
        this.length1 = this.length1 + house.getLength();
        this.houses1.remove(house);
        System.out.println("House deleted successfully!");
    };
/**
 * This function removes the given House object from the side 2 of the street
 * @param house
 */
    public void deleteHouseSide2(House house){
        for(int i=0; i<this.index2; i++)
        {
            if(this.side2[i][0]==house.getPosition())
            {
                for(int j=i; j<this.index2; j++){
                    this.side2[j][0] = this.side2[j+1][0];
                    this.side2[j][1] = this.side2[j+1][1];
                    this.side2[j][2] = this.side2[j+1][2];
                }
                this.index2--;
            }
        }
        this.total = this.total - house.getLength();
        this.length2 = this.length2 + house.getLength();
        this.houses2.remove(house);
        System.out.println("House deleted successfully!");
    };
/**
 * This function removes the given Office object from the side 1 of the street
 * @param office
 */
    public void deleteOfficeSide1(Office office){
        for(int i=0; i<this.index1; i++)
        {
            if(this.side1[i][0]==office.getPosition())
            {
                for(int j=i; j<this.index1; j++){
                    this.side1[j][0] = this.side1[j+1][0];
                    this.side1[j][1] = this.side1[j+1][1];
                    this.side1[j][2] = this.side1[j+1][2];
                }
                this.index1--;
            }
        }
        this.total = this.total - office.getLength();
        this.length1 = this.length1 + office.getLength();
        this.offices1.remove(office);
        System.out.println("Office deleted successfully!");
    };
/**
 * This function removes the given Office object from the side 2 of the street
 * @param office
 */
    public void deleteOfficeSide2(Office office){
        for(int i=0; i<this.index2; i++)
        {
            if(this.side2[i][0]==office.getPosition())
            {
                for(int j=i; j<this.index2; j++){
                    this.side2[j][0] = this.side2[j+1][0];
                    this.side2[j][1] = this.side2[j+1][1];
                    this.side2[j][2] = this.side2[j+1][2];
                }
                this.index2--;
            }
        }
        this.total = this.total - office.getLength();
        this.length2 = this.length2 + office.getLength();
        this.offices2.remove(office);
        System.out.println("Office deleted successfully!");
    };
/**
 * This function removes the given Market object from the side 1 of the street
 * @param market
 */
    public void deleteMarketSide1(Market market){
        for(int i=0; i<this.index1; i++)
        {
            if(this.side1[i][0]==market.getPosition())
            {
                for(int j=i; j<this.index1; j++){
                    this.side1[j][0] = this.side1[j+1][0];
                    this.side1[j][1] = this.side1[j+1][1];
                    this.side1[j][2] = this.side1[j+1][2];
                }
                this.index1--;
            }
        }
        this.total = this.total - market.getLength();
        this.length1 = this.length1 + market.getLength();
        this.markets1.remove(market);
        System.out.println("Market deleted successfully!");
    };
/**
 * This function removes the given Market object from the side 2 of the street
 * @param market
 */
    public void deleteMarketSide2(Market market){
        for(int i=0; i<this.index2; i++)
        {
            if(this.side2[i][0]==market.getPosition())
            {
                for(int j=i; j<this.index2; j++){
                    this.side2[j][0] = this.side2[j+1][0];
                    this.side2[j][1] = this.side2[j+1][1];
                    this.side2[j][2] = this.side2[j+1][2];
                }
                this.index2--;
            }
        }
        this.total = this.total - market.getLength();
        this.length2 = this.length2 + market.getLength();
        this.markets2.remove(market);
        System.out.println("Market deleted successfully!");
    };
/**
 * This function removes the given Playground object from the side 1 of the street
 * @param playground
 */
    public void deletePlaygroundSide1(Playground playground){
        for(int i=0; i<this.index1; i++)
        {
            if(this.side1[i][0]==playground.getPosition())
            {
                for(int j=i; j<this.index1; j++){
                    this.side1[j][0] = this.side1[j+1][0];
                    this.side1[j][1] = this.side1[j+1][1];
                    this.side1[j][2] = this.side1[j+1][2];
                }
                this.index1--;
            }
        }
        this.length1 = this.length1 + playground.getLength();
        this.playgrounds1.remove(playground);
        System.out.println("Playground deleted successfully!");
    };
/**
 * This function removes the given Playground object from the side 2 of the street
 * @param playground
 */
    public void deletePlaygroundSide2(Playground playground){
        for(int i=0; i<this.index2; i++)
        {
            if(this.side2[i][0]==playground.getPosition())
            {
                for(int j=i; j<this.index2; j++){
                    this.side2[j][0] = this.side2[j+1][0];
                    this.side2[j][1] = this.side2[j+1][1];
                    this.side2[j][2] = this.side2[j+1][2];
                }
                this.index2--;
            }
        }
        this.length2 = this.length2 + playground.getLength();
        this.playgrounds2.remove(playground);
        System.out.println("Playground deleted successfully!");
    };
/**
 * This function returns the length parameter of the street
 * @return
 */
    public int getLength() {
        return this.length;
    }
/**
 * This function sets the length values of the street by the length parameter given by user
 * @param length
 */
    public void setLength(int length) {
        this.length = length;
        this.length1 = length;
        this.length2 = length;
    }
/**
 * This function returns the remaining length of lands on the street
 * @return
 */
    public int getRemainingLength(){
        return (this.length1 + this.length2);
    }
/**
 * This function returns number of houses on the side 1 of the street
 * @return
 */
    public int getSizeHouses1(){
        return(this.houses1.size());
    }
/**
 * This function returns number of houses on the side 2 of the street
 * @return
 */
    public int getSizeHouses2(){
        return(this.houses2.size());
    }
/**
 * This function returns number of offices on the side 1 of the street
 * @return
 */
    public int getSizeOffices1(){
        return(this.offices1.size());
    }
/**
 * This function returns number of offices on the side 2 of the street
 * @return
 */
    public int getSizeOffices2(){
        return(this.offices2.size());
    }
/**
 * This function returns number of markets on the side 1 of the street
 * @return
 */
    public int getSizeMarkets1(){
        return(this.markets1.size());
    }
/**
 * This function returns number of markets on the side 2 of the street
 * @return
 */
    public int getSizeMarkets2(){
        return(this.markets2.size());
    }
/**
 * This function returns the House object on side 1 of the street whose parameter is given by index
 * @param index
 * @return
 */
    public House getHouses1(int index){
        return(this.houses1.get(index));
    }
/**
 * This function returns the House object on side 2 of the street whose parameter is given by index
 * @param index
 * @return
 */
    public House getHouses2(int index){
        return(this.houses2.get(index));
    }
/**
 * This function returns the Office object on side 1 of the street whose parameter is given by index
 * @param index
 * @return
 */
    public Office getOffices1(int index){
        return(this.offices1.get(index));
    }
/**
 * This function returns the Office object on side 2 of the street whose parameter is given by index
 * @param index
 * @return
 */
    public Office getOffices2(int index){
        return(this.offices2.get(index));
    }
/**
 * This function returns the Market object on side 1 of the street whose parameter is given by index
 * @param index
 * @return
 */
    public Market getMarkets1(int index){
        return(this.markets1.get(index));
    }
/**
 * This function returns the Market object on side 2 of the street whose parameter is given by index
 * @param index
 * @return
 */
    public Market getMarkets2(int index){
        return(this.markets2.get(index));
    }
/**
 * This function returns the number of playgrounds on side 1 of the street
 * @return
 */
    public int getSizePlaygrounds1(){
        return(this.playgrounds1.size());
    }
/**
 * This function returns the number of playgrounds on side 2 of the street
 * @return
 */
    public int getSizePlaygrounds2(){
        return(this.playgrounds2.size());
    }
/**
 * This function returns the Playground object on side 1 of the street whose parameter is given by index
 * @param index
 * @return
 */
    public Playground getPlaygrounds1(int index){
        return(this.playgrounds1.get(index));
    }
/**
 * This function returns the Playground object on side 2 of the street whose parameter is given by index
 * @param index
 * @return
 */
    public Playground getPlaygrounds2(int index){
        return(this.playgrounds2.get(index));
    }
/**
 * This function returns the total length of lands occupied by buildings
 * @return
 */
    public int getTotal(){
        return this.total;
    }
/**
 * This function displays the skyline silhouette of the street on console
 */
    public void silhouette(){
        int max=0;
        int tempMax=0;

        for(int i=0; i<this.index1; i++){
            if(this.side1[i][2]>max){
                max = this.side1[i][2];
            }
        }

        for(int i=0; i<this.index2; i++){
            if(this.side2[i][2]>max){
                tempMax = this.side2[i][2];
            }
        }

        if(tempMax>max){
            max = tempMax;
        }
    
        int left=0;
        int cont=0;
        
        for(int j=max; j>=0; j--){
            for(int i=0; i<=getLength(); i++){
                for(int k=0; k<this.index1; k++){
                    if((this.side1[k][2] == j) && (i > this.side1[k][0] && i <= this.side1[k][0] + this.side1[k][1]))
                    {
                        for(int x=left; x<i-1; x++){
                            System.out.print(" ");
                        }
                        left = i;
                        for(int y=0; y<index2; y++){
                            if(this.side2[y][2] >= j && (i>=this.side2[y][0] && i<= this.side2[y][0] + this.side2[y][1])){
                                if(i == side2[y][0]){
                                    cont = 2;
                                }
                                else if(i == side2[y][0] + side2[y][1]){
                                    cont = 3;
                                }
                                else{
                                    cont = 1;
                                }
                                break;
                            }
                        }
                        if(cont==1){
                            System.out.print(" ");
                        }
                        else if(cont == 0){
                            System.out.print("_");
                        }
                        cont=0;
                    }
                    if(i==this.side1[k][0] || i==this.side1[k][0]+this.side1[k][1]){
                        if(this.side1[k][2] > j){
                            for(int x=left; x<i-1; x++){
                                System.out.print(" ");
                            }
                            left = i;
                            for(int y=0; y<this.index2; y++){
                                if(this.side2[y][2] > j && (i >= this.side2[y][0] && i <= this.side2[y][0] + this.side2[y][1])){
                                    cont = 1;
                                }
                            }
                            if(cont == 1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("|");
                            }
                            cont = 0;
                        }
                    }
                }

                for(int k=0; k<this.index2; k++){
                    if((this.side2[k][2] == j) && (i > this.side2[k][0] && i <= this.side2[k][0] + this.side2[k][1]))
                    {
                        for(int x=left; x<i-1; x++){
                            System.out.print(" ");
                        }
                        left = i;
                        for(int y=0; y<index1; y++){
                            if(this.side1[y][2] >= j && (i>=this.side1[y][0] && i<= this.side1[y][0] + this.side1[y][1])){
                                if(i == side1[y][0]){
                                    cont = 2;
                                }
                                else if(i == side1[y][0] + side1[y][1]){
                                    cont = 3;
                                }
                                else{
                                    cont = 1;
                                }
                                break;
                            }
                        }
                        if(cont==1){
                            System.out.print(" ");
                        }
                        else if(cont == 0){
                            System.out.print("_");
                        }
                        cont=0;
                    }
                    if(i==this.side2[k][0] || i==this.side2[k][0]+this.side2[k][1]){
                        if(this.side2[k][2] > j){
                            for(int x=left; x<i-1; x++){
                                System.out.print(" ");
                            }
                            left = i;
                            for(int y=0; y<this.index1; y++){
                                if(this.side1[y][2] > j && (i >= this.side1[y][0] && i <= this.side1[y][0] + this.side1[y][1])){
                                    cont = 1;
                                }
                            }
                            if(cont == 1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("|");
                            }
                            cont = 0;
                        }
                    }
                }
            }
            System.out.print("\n");
            left=0;
        }
    }
}

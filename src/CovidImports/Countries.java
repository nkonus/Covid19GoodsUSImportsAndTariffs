package CovidImports;
import java.util.Arrays;


public class Countries {

//---------------MAIN---------------------	
	public static void main(String[] args) {
        String[] countryName = {"Brazil", "Canada", "South Africa", "Italy", "Georgia", "All other sources", "China", "New Zealand", "Mexico", "United Kingdom", "Brazil", "All other sources", "Japan", "Mexico", "Canada", "Switzerland", "United Kingdom", "All other sources", "Canada", "Japan", "Mexico", "Germany", "Belgium", "All other sources", "Ireland", "Singapore", "Netherlands", "South Korea", "Austria", "All other sources", "Ireland", "South Korea", "Singapore", "Denmark", "Switzerland", "All other sources", "Ireland", "Germany", "Netherlands", "Japan", "Switzerland", "All other sources", "Austria", "Italy", "Germany", "United Kingdom", "Sweden", "All other sources", "Ireland", "Belgium", "Canada", "Italy", "Germany", "All other sources", "China", "Austria", "Italy", "India", "Germany", "All other sources", "Italy", "Canada", "Netherlands", "Austria", "China", "All other sources", "India", "Portugal", "China", "Mexico", "Singapore", "Germany", "China", "Portugal", "Israel", "All other sources", "Portugal", "Italy", "India", "Austria", "Jordan", "All other sources", "Italy", "China", "India", "Spain", "Germany", "All other sources", "India", "Slovenia", "Italy", "Austria", "China", "All other sources", "India", "Sweden", "Canada", "Austria", "Spain", "All other sources", "India", "Canada", "Brazil", "Israel", "India", "Australia", "Canada", "Italy", "China", "All other sources", "Canada", "India", "Italy", "Israel", "Switzerland", "All other sources", "Germany", "Switzerland", "Israel", "Vietnam", "India", "All other sources", "India", "Canada", "France", "Japan", "Hungary", "All other sources", "Israel", "Canada", "Japan", "Belgium", "Italy", "All other sources", "Ireland", "Switzerland", "Germany", "Canada", "India", "All other sources", "Ireland", "Germany", "France", "United Kingdom", "India", "All other sources", "Switzerland", "Ireland", "India", "Belgium", "United Kingdom", "All other sources", "China", "Brazil", "Finland", "Mexico", "United Kingdom", "All other sources", "China", "United Kingdom", "France", "Germany", "Poland", "All other sources", "Mexico", "China", "Ireland", "Canada", "United Kingdom", "All other sources", "Mexico", "China", "United Kingdom", "Canada", "Poland", "All other sources", "China", "United Kingdom", "Canada", "Italy", "Mexico", "All other sources", "Mexico", "China", "United Kingdom", "Canada", "Turkey", "All other sources", "Canada", "China", "Ireland", "Mexico", "Germany", "All other sources", "Canada", "Mexico", "Germany", "China", "France", "All other sources", "Italy", "United Kingdom", "France", "Germany", "Canada", "All other sources", "China", "Sweden", "United Kingdom", "Japan", "Germany", "All other sources", "United Kingdom", "Singapore", "Germany", "Canada", "Sweden", "All other sources", "United Kingdom", "Germany", "China", "Canada", "Switzerland", "All other sources", "Germany", "Canada", "Japan", "China", "Mexico", "All other sources", "Germany", "Japan", "Canada", "China", "Mexico", "All other sources", "China", "Canada", "Mexico", "Taiwan", "Vietnam", "All other sources", "China", "South Korea", "France", "Mexico", "Vietnam", "All other sources", "China", "Malaysia", "France", "Vietnam", "Thailand", "All other sources", "China", "Vietnam", "Malaysia", "Hong Kong", "Thailand", "All other sources", "China", "Mexico", "Canada", "Taiwan", "Vietnam", "All other sources", "China", "Canada", "Taiwan", "India", "Guatemala", "All other sources", "Mexico", "China", "Canada", "Germany", "United Kingdom", "All other sources", "China", "Mexico", "Canada", "Germany", "Taiwan", "All other sources", "China", "Mexico", "Canada", "Germany", "Japan", "All other sources", "Malaysia", "Thailand", "Sri Lanka", "Austria", "China", "All other sources", "Thailand", "Malaysia", "Sri Lanka", "Indonesia", "Italy", "All other sources", "Malaysia", "Thailand", "China", "Indonesia", "Sri Lanka", "All other sources", "Malaysia", "China", "Thailand", "Indonesia", "Vietnam", "All other sources", "Malaysia", "Thailand", "China", "Indonesia", "Vietnam", "All other sources", "Mexico", "China", "Taiwan", "India", "Sri Lanka", "All other sources", "Colombia", "China", "United Kingdom", "Mexico", "Malaysia", "All other sources", "China", "Indonesia", "Mexico", "Costa Rica", "El Salvador", "All other sources", "China", "Canada", "Dominican Rep", "South Korea", "Mexico", "All other sources", "China", "Malaysia", "Pakistan", "Sri Lanka", "Vietnam", "All other sources", "China", "Mexico", "United Kingdom", "Cambodia", "Honduras", "All other sources", "China", "Mexico", "Honduras", "Vietnam", "Cambodia", "All other sources", "China", "Mexico", "Hong Kong", "Pakistan", "Malaysia", "All other sources", "China", "Bangladesh", "Hong Kong", "Mexico", "Malaysia", "All other sources", "China", "Vietnam", "Canada", "Indonesia", "Burma", "All other sources", "China", "Sweden", "Colombia", "Italy", "Mexico", "All other sources", "China", "Honduras", "Pakistan", "Bangladesh", "Vietnam", "All other sources", "Dominican Rep", "China", "Mexico", "Thailand", "Vietnam", "All other sources", "Mexico", "China", "Dominican Rep", "Thailand", "Honduras", "All other sources", "China", "Mexico", "Germany", "Canada", "Dominican Rep", "All other sources", "China", "Mexico", "Pakistan", "Jordan", "Vietnam", "All other sources", "China", "Mexico", "Canada", "India", "Vietnam", "All other sources", "China", "Sri Lanka", "Haiti", "Taiwan", "Turkey", "All other sources", "Mexico", "China", "Thailand", "Cambodia", "Bangladesh", "All other sources", "China", "Mexico", "Canada", "Italy", "Vietnam", "All other sources", "Mexico", "China", "Canada", "Thailand", "Malaysia", "All other sources", "China", "Taiwan", "Mexico", "Canada", "Germany", "All other sources", "United Kingdom", "Israel", "China", "Canada", "Taiwan", "All other sources", "Mexico", "Canada", "Poland", "United Kingdom", "Slovenia", "All other sources", "Mexico", "Finland", "Sweden", "Canada", "Italy", "All other sources", "Canada", "China", "United Kingdom", "Mexico", "Italy", "All other sources", "Canada", "Denmark", "Norway", "Netherlands", "United Kingdom", "All other sources", "China", "Mexico", "Canada", "Taiwan", "Thailand", "All other sources", "China", "Taiwan", "Vietnam", "Netherlands", "Israel", "All other sources", "China", "Vietnam", "Taiwan", "Canada", "Australia", "All other sources", "China", "Taiwan", "Thailand", "Mexico", "Hong Kong", "All other sources", "Switzerland", "Mexico", "Israel", "India", "China", "All other sources", "China", "Hong Kong", "Mexico", "Thailand", "Singapore", "All other sources", "Canada", "China", "Malaysia", "Germany", "India", "All other sources", "South Korea", "China", "Japan", "Malaysia", "Norway", "All other sources", "Japan", "Germany", "Israel", "China", "Czech Republic", "All other sources", "Germany", "Mexico", "Ireland", "China", "Costa Rica", "All other sources", "China", "Malaysia", "Indonesia", "Mexico", "Germany", "All other sources", "China", "South Korea", "Singapore", "Mexico", "Germany", "All other sources", "China", "Germany", "Mexico", "Japan", "Switzerland", "All other sources", "Mexico", "Taiwan", "Israel", "Switzerland", "United Kingdom", "All other sources", "Ireland", "Mexico", "Japan", "Germany", "Denmark", "All other sources", "Mexico", "India", "Malaysia", "Ireland", "China", "All other sources", "Mexico", "Ireland", "Costa Rica", "Canada", "China", "All other sources", "Mexico", "Japan", "Costa Rica", "Ireland", "China", "All other sources", "Mexico", "Germany", "China", "Canada", "United Kingdom", "All other sources", "Ireland", "Mexico", "Dominican Rep", "Costa Rica", "Germany", "All other sources", "Mexico", "Germany", "Costa Rica", "Dominican Rep", "Switzerland", "All other sources", "Singapore", "China", "Mexico", "Australia", "New Zealand", "All other sources", "France", "United Kingdom", "Mexico", "Germany", "Philippines", "All other sources", "Canada", "Germany", "United Kingdom", "France", "China", "All other sources", "Germany", "China", "Israel", "Japan", "France", "All other sources", "China", "Mexico", "Costa Rica", "Taiwan", "Hong Kong", "All other sources", "China", "Mexico", "Japan", "United Kingdom", "France", "All other sources", "China", "Germany", "Taiwan", "Canada", "United Kingdom", "All other sources", "Switzerland", "Germany", "Japan", "United Kingdom", "New Zealand", "All other sources", "China", "Japan", "Germany", "Taiwan", "Singapore", "All other sources", "Mexico", "Israel", "China", "Germany", "Czech Republic", "All other sources", "Mexico", "China", "Canada", "Czech Republic", "Poland", "All other sources", "China", "Germany", "Taiwan", "Mexico", "Canada", "All other sources"};
        double[] imports = {254630684,22009206,13467723,664327,0,5286400,21458600,3939978,1822924,596670,1299294,2392562,1052804,459639,306401,0,39672,31574,38727904,7740707,860401,642668,148242,735026,416565,793729608,38004124,386982,10167,45837261,2327781152d,1283287258,300204926,428084911,171069079,197871949,4823781843d,6127943447d,2177640226d,1481050221,1002717264,4722650119d,37865297,76045614,12147542,25443964,6380154,25115722,2097418740,3664083352d,408014545,326578531,209344159,575652395,1842474,1257236,1257702,56993,162756,22641,46037334,4457347,608608,4265300,4993172,2392226,8120,0,0,0,23656196,61421045,52453412,49316172,26001862,231700882,34992062,17810241,3684582,6026505,1248099,182438,4019128,13857851,5276767,8806147,88426,528996,71929743,45457556,25202924,18701695,2895428,1113568,74217664,67613702,32296670,15145024,23452237,69701337,11408625,1727276,218880,388487,25964200,0,149357,313207,32800,54687,1376624863,559705581,192446986,41967651,57957950,477676046,1242495261,9275212,0,2574462,2472775,5030537,7469286,168158,970680,874135,0,94801,101515864,68088099,55065210,39536833,25662895,41468937,344402322,204606814,172678683,289556491,323410597,495443968,470663565,196911350,150534497,38272905,86637465,299206854,2284313139d,1486496468,1232506922,1326904249,735466368,3897075300d,160878841,53774478,50858642,64589546,47029383,81673203,242314579,69778960,16068949,20931100,14450378,103288368,18848300,7487524,4523353,1437835,1579377,2181171,63746396,24207620,18903260,30063123,24960465,82266241,106545933,7722833,1721619,14329971,10437790,23654734,18355137,15649922,10462939,10290836,4917979,35499045,5152909,1158379,803209,935497,545052,315214,47656608,6443778,4506386,7689276,1544589,8827008,34125260,30982313,22194110,20914712,19690354,63163005,132688945,118459548,104284321,63075810,64900373,286602045,520932390,569437047,391525446,416544788,228523809,990672160,12172884,5280017,2092716,1468178,1910686,8545075,-1,-1,-1,-1,-1,-1,224349656,157545410,142100012,132637896,67559509,419527184,352102208,375700124,189310778,81139224,96462192,350329144,212122104,38213806,22012979,23503311,26477823,152544146,159512811,1447786,1501056,343868,0,644406,399659584,6691027,3753823,318444,2381472,3843500,25823730,169133,814042,166463,173514,1143286,162761670,140591542,13047192,10702053,8107616,32447724,89427427,86757009,56696983,63080014,20966248,167245250,2503645576d,794777649,495626017,244011002,212586712,1459758565,-1,-1,-1,-1,-1,-1,46756493,22008316,5455796,1358058,509466,491857,176154894,147029943,16880939,3710573,508789,807414,115486817,12472024,12889989,3487809,693708,522029,983844058,200159326,124303244,55913716,4356622,3855093,318683707,215115859,26617419,70343750,16762413,14304882,400,236389,153672,122292,191667,225698,3981840,2278747,1977558,1230903,589810,2326446,1741934,1102292,365142,0,56856,205005,361480884,65196282,11893928,15469598,4667774,22077339,155974571,19492613,17025311,12634472,10649463,16701789,405433,27274,1260,39892,9707,8636,428675625,141718426,86790292,54031981,46237835,39837690,4115152,247451,17357,27574,0,29467,9034766,925838,124085,210215,103421,120055,82251469,3478899,76633,753474,1654945,3246466,958477,0,14688,169221,73721,158492,13752851,1420974,774701,877404,796055,614569,5088848,5197058,1082463,96315,0,15489,191965051,159486567,73996510,13289882,4769815,1529559,4840525,2238803,41849,8384,3128,18473,141371133,10841613,409466,558944,776339,116732,2315789394d,293755336,109997735,83245124,83417060,327500325,12921732,2899219,1232839,488666,216820,703025,212772688,29998060,331008,359820,534179,575490,9047102,1577075,404908,659390,951200,2224457,81247369,52023894,15888216,17839387,14464259,69738032,139491160,38909327,13713324,10641012,3945314,13404398,15096001,12411900,10325833,3341589,6843019,6068616,60531403,18352393,12797574,12851593,5466227,10619594,15902338,15189982,7877998,4080915,4150823,18465282,78826354,18444941,19905888,9468504,9183885,26553605,316637315,45325590,1362770,9114668,7462235,27885914,95458480,49776736,21466767,2624714,1619763,6255295,29544174,12646985,8274307,307708,79530,136721,72827352,10321734,6957069,8883755,1599714,2217902,503764811,146231816,126134182,62983075,21159883,59563527,312242442,13733208,398477,4595142,3183078,4405548,604254,728478,273901,0,386794,464596,86869427,12117756,14725910,2641536,9555956,10252078,111757432,78635944,48046656,33730387,21834486,101895832,687477490,76796713,51961044,28956784,9051514,114273797,248684653,88190485,102062702,39064518,87144512,182443717,13029704,10505790,11003065,9876274,2237255,2180691,36933147,16972512,8693475,9380709,10408295,29066249,53971488,22651124,29871127,12046464,14506256,37073376,86515079,88826380,49554721,47924022,30062367,159372338,334392073,97452151,52447931,41659517,49485218,196058499,22162987,18405399,13387757,12560287,3490711,5174768,1822921686,708659130,509482447,220194377,140794657,695072223,604908497,389125940,230369168,203005906,85375215,470342144,59006941,48104906,44520787,49234285,9284218,46916767,528881180,260592130,157604958,74999938,146746913,506789444,2131329101,806815847,681829781,547347393,365774833,2662403242d,919514568,449696746,413936879,256032376,117454865,541017219,46656875,41648681,18100700,19214693,17400698,32267280,15873779,5905005,9173514,7876767,4127004,14315481,340891480,48400275,99815066,107891853,26011191,60309307,50720859,39488978,2820097,2298810,5253,938744,162624853,72061629,29871591,34436460,27841692,140449920,993725,166393,299909,359653,121417,1054298,63982806,11178675,5526687,1550482,56330,4352824,129201169,80115318,29887198,31598279,25557009,116393765,154159948,53726664,4080205,7996386,3285862,4910041,91033294,66212922,40145211,19997778,12849752,8626930,300535658,125329411,70726867,60016638,61897912,124075520};
        System.out.println("Welcome to the Sorting Tester");
        System.out.println("This program demonstrates different sorting methods"
        		+ " and their effciencies using COVID-19 Related Goods: U.S. Imports and Tariffs ");
        CountryImports[] countries = new CountryImports[imports.length];
        for(int i = 0; i < countries.length; i++) {
        	countries[i] = new CountryImports(imports[i], countryName[i]);
        }
      //  bubbleSort(countries);
      //  insertionSort(countries);
      //  selectionSort(countries);
      //  mergeSort(countries);
        quickSort(countries);
    }

//-----------------------------------------
	
	 public static void bubbleSort(CountryImports[] original) {
		 CountryImports[] sorted = Arrays.copyOf(original, original.length);
	    	long startTime = System.currentTimeMillis();
	    	CountryImports temp; 
	        boolean swap = false; 
	        for (int i = 0; i < sorted.length - 1; i++){ 
	        	swap = false; 
	            for (int j = 0; j < sorted.length - i - 1; j++){ 
	                if (sorted[j].getNumberOfImports() > sorted[j + 1].getNumberOfImports()){ 
	                    temp = sorted[j]; 
	                    sorted[j] = sorted[j + 1]; 
	                    sorted[j + 1] = temp; 
	                    swap = true; 
	                } 
	            } 
	            if (swap == false) 
	                break; 
	        } 

	    	printArray(sorted);
	    	long endTime = System.currentTimeMillis();
	    	System.out.println("This sort took: " + ((double)endTime - startTime)/1000 + " seconds");
	    	System.out.println("Sort finished.");
	    }
	 
//-----------------------------------------
	 public static void insertionSort(CountryImports[] original) {
		 CountryImports[] sorted = Arrays.copyOf(original, original.length);
	    	long startTime = System.currentTimeMillis();
	    	for (int i = 1; i < sorted.length; ++i) { 
	    		CountryImports key = sorted[i]; 
	            int j = i - 1; 
	            while (j >= 0 && sorted[j].getNumberOfImports() > key.getNumberOfImports()) { 
	                sorted[j + 1] = sorted[j]; 
	                j = j - 1; 
	            } 
	            sorted[j + 1] = key; 
	        } 
	    	printArray(sorted);
	    	long endTime = System.currentTimeMillis();
	    	System.out.println("Insertion sort took: " + ((double)endTime - startTime)/1000 + " seconds");
	    	System.out.println("Sort finished.");
	    }
	
	
	 
//-----------------------------------------
	 public static void selectionSort(CountryImports[] original) {
		 CountryImports[] sorted = Arrays.copyOf(original, original.length);
	    	long startTime = System.currentTimeMillis();
	    	int n = sorted.length;
	    	for(int i = 0; i < n-1; i++) {
	    		int min_idx = i;
	    		for(int j = i + 1; j < n; j++) {
	    			if(sorted[j].getNumberOfImports() < sorted[min_idx].getNumberOfImports()) {
	    				min_idx = j;
	    			}
	    		}
	    		CountryImports temp = sorted[min_idx]; 
	    		sorted[min_idx] = sorted[i]; 
	    		sorted[i] = temp; 
	    	}
	    	
	    	printArray(sorted);
	    	long endTime = System.currentTimeMillis();
	    	System.out.println("Selection sort took: " + ((double)endTime - startTime)/1000 + " seconds");
	    	System.out.println("Sort finished.");
	    }
	    	
		
		
//-----------------------------------------		 
	    public static void mergeSort(CountryImports[] original) {
	    	CountryImports[] sorted = Arrays.copyOf(original, original.length);
	    	long startTime = System.currentTimeMillis();
	    	mergeSortSort(sorted, sorted.length);
	    	printArray(sorted);
	    	long endTime = System.currentTimeMillis();
	    	System.out.println("Merge sort took: " + ((double)endTime - startTime)/1000 + " seconds");
	    	System.out.println("Sort finished.");
	    }
	    
	    private static void mergeSortSort(CountryImports[] sorted, int n) {
	    	if (n < 2) {
	            return;
	        }
	        int mid = n / 2;
	        CountryImports[] l = new CountryImports[mid];
	        CountryImports[] r = new CountryImports[n - mid];
	     
	        for (int i = 0; i < mid; i++) {
	            l[i] = sorted[i];
	        }
	        for (int i = mid; i < n; i++) {
	            r[i - mid] = sorted[i];
	        }
	        mergeSortSort(l, mid);
	        mergeSortSort(r, n - mid);
	     
	        mergeSortMerge(sorted, l, r, mid, n - mid);
		}
	    
	    private static void mergeSortMerge(CountryImports[] sorted, CountryImports[] l, CountryImports[] r, int left, int right) {
	    	int i = 0;
	    	int j = 0;
	    	int k = 0;
	        while (i < left && j < right) {
	            if (l[i].getNumberOfImports() <= r[j].getNumberOfImports()) {
	                sorted[k++] = l[i++];
	            }
	            else {
	                sorted[k++] = r[j++];
	            }
	        }
	        while (i < left) {
	            sorted[k++] = l[i++];
	        }
	        while (j < right) {
	            sorted[k++] = r[j++];
	        }
	        
		}
	    
//-----------------------------------------	
	    
	    public static void quickSort(CountryImports[] original) {
	    	CountryImports[] sorted = Arrays.copyOf(original, original.length);
	    	long startTime = System.currentTimeMillis();
	    	quickSortSort(sorted, 0, sorted.length - 1);
	    	printArray(sorted);
	    	long endTime = System.currentTimeMillis();
	    	System.out.println("This sort took: " + ((double)endTime - startTime)/1000 + " seconds");
	    	System.out.println("Sort finished.");
	    }
	    
	    private static void quickSortSort(CountryImports[] sorted, int i, int j) {
			if(i < j) {
				int part = partition(sorted, i, j);
				quickSortSort(sorted, i, part - 1);
				quickSortSort(sorted, part + 1, j);
			}
			
		}

		private static int partition(CountryImports[] sorted, int low, int high) {
			double pivot = sorted[high].getNumberOfImports();
			int i = low - 1;
			for(int j = low; j < high; j++) {
				if(sorted[j].getNumberOfImports() < pivot) {
					i++;
					CountryImports temp = sorted[i]; 
					sorted[i] = sorted[j]; 
	                sorted[j] = temp; 
				}
			}
			CountryImports temp = sorted[i+1]; 
	        sorted[i+1] = sorted[high]; 
	        sorted[high] = temp; 
	  
	        return i+1; 
			
		}

	    
//-----------------------------------------		
	 private static void printArray(CountryImports[] original) {
	    	for(int i = 0; i < original.length; i++) {
	    		System.out.println(original[i].getCountry() + " has imported " + original[i].getNumberOfImports()+ ".");
	    	}
	    }
	
	
}

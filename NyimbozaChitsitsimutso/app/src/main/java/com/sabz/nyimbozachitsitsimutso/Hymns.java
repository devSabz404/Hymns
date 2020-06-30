package com.sabz.nyimbozachitsitsimutso;

public class Hymns {
    private int hymnNumber;
    private String hymnTitle;
   private String hymnLyrics;

   private Hymns(int hymnNumber,String hymnTitle,String hymnLyrics){
       this.hymnNumber=hymnNumber;
       this.hymnTitle=hymnTitle;
       this.hymnLyrics=hymnLyrics;
   }

   public static final Hymns[]hymns={
           new Hymns(1,"1.Chikondi Chotele(Such love)","Mlungu anandikonda kotere, Chisoni chasanduka chimwemwe, Nandiitana ndiyandikire, Nchodabwitsa chikondi chake.\n" +
                   "\n" +
                   "Chikondi chotere, Chikondi chotere, Anakonda wochimwa ngati’ne, Ntchodabwitsa chikondicho\n" +
                   "\n" +
                   "Khristu wadzipereka kwaulere, Anafa pa Mtanda wa Kalvari, Lilime lilephera kunena, Za chikondi chondiombola.\n" +
                   "\n" +
                   "Tsopano ndakhala mwana wake, Samandiyesa kapolo wamba, Kulowerera kwanga kwathadi, Nchotseguka chisomo chake.\n" +
                   "\n"),
           new Hymns(2,"2.Ndiyimba ndi Chimwemwe (O, Say But I’m Glad)","Ndiyimba ndi chimwemwe lero, Kale ndinalephera; Wandichotsera Yesu tchimo,\n" +
                   "O, haleluya.\n" +
                   "\n" +
                   "O, haleluya, O, haleluya, Walowa Yesu mumtima mwanga, O, haleulya.\n" +
                   "\n" +
                   "Walowa ndi chikondi chake, Mumtima wachisoni, Tsiku lonse ndirikuimba,\n" +
                   "O, haleluya.\n" +
                   "\n" +
                   "Ch’yanjano chathu chiri bwino, Koposa china chonse, Kukhala ndi Yesu ndikondadi,\n" +
                   "O, haleluya."),
           new Hymns(3,"3.Yimbirani Chikondi cha Yesu (When We All Get To Heaven)","Yimbirani chikondi cha Yesu, Chifundo chake ndi chisomo, M’nyumbazo zonyezimira; Atikonzera malo.\n" +
                   "\n" +
                   "Mmene tifika Kumwamba, Tsikulo ndi Chimwemwe tipfuula, Pakumuona Yesu,\n" +
                   "Tidzaimba haleluya.\n" +
                   "\n" +
                   "Pakuyenda m’njira pansi pano, Imaonekamitambo bii, Koma potha pa ulendo,\n" +
                   "Kulibenso chisoni.\n" +
                   "\n" +
                   "Tizikhala okhulupilika, Tizilimbikira pantchito; Kungomuona Mbuye wathu\n" +
                   "Kudzakwanira mphotho.\n" +
                   "\n" +
                   "Tiyeni tithamangire mfupo, Posachedwa timuona mwini, Zipata zidzatseguka,\n" +
                   "Tiyende pa golidi"),
           new Hymns(4,"4.Bwezi Langa ndi Yesu (Lily of the Valley)","Bwenzi langa ndiye Yesu, Andikwaniritsa, Apamban’anthu onse m’moyo mwanga,\n" +
                   "Ndiye kakombo wa m’zigwa, mwa Iye ndiona, Zonse ndisowa zakunditsukira;\n" +
                   "Ngakhale mu chisoni, kapena m’zovuta, Anyamula katundu wanga yense, haleluya,\n" +
                   "Ndiye Kakombo wa m’zigwa, Nthanda yokomatu, Apamban’anthu onse m’moyo mwanga.\n" +
                   "\n" +
                   "Wanyamula masautso, chisoni changanso, Ku mayeso andikanditsa ine,\n" +
                   "Zoipa zonse ndasiya, mafano ndaswatu, Lero ndasungidwa ndi mphamvu yake,\n" +
                   "Abwenzi akachoka Satan’akayesa, Mwa Yesu ndidzafika Kumwambako, haleluya,\n" +
                   "Ndiye kakombo wa m’zigwa, Nthanda yokomatu, Apamban’anthu onse m’moyo mwanga.\n" +
                   "\n" +
                   "Sadzandilephera konse pa dzilo linotu, Ndikakhala ndi chikhulupiriro;\n" +
                   "Ndi moto amandizinga kuti ndingaope.  Ndi mana ake amandikhutitsa;\n" +
                   "Ndikwera posachedwa kuona Mbuy’ anga, Ku misinje yamoyo Kumwambako, haleluya, Ndiye kakombo wa m’zigwa, Nthanda yokomatu, Apambana’anthu onse m’moyo mwanga.\n"),
           new Hymns(5,"5.Patsiku La Ambuye (Behold I Live)","Pa tsiku la Ambuye Yohane anagwidwa, Ndi Mzimu wa Mulungu, naonanso Mwana; Nati, Ndine Woyamba ndi Wotsilizanso, Taona ndili Wamoyotu.\n" +
                   "\n" +
                   "Wamoyotu, wamoyotu, Taona nditi Wamoyotu;  Wamoyotu, wamoyotu, Taona nditi Wamoyotu.\n" +
                   "\n" +
                   "Taona ndili Wamoyo ku nthawi za nthawi; Ndatenga zifungulo za imfa ndi Hade,\n" +
                   "Ndapha mphamvu ya imfa, isakuopsenso, Taona ndili Wamoyotu.\n" +
                   "\n" +
                   "Yesu mwini wa moyo, ndithu abweranso,Mtima usavutike, musamaopenso,\n" +
                   "Mphotho abwera nayo, yakupatsa yense, Taona ndiri Wamoyotu\n" +
                   "\n" +
                   "Wochimwa lapa mtima, leka za dzikozo, Ulandire kwa Ine moyo wosathanso,\n" +
                   "Ndikupatsa Mzimu’yo wondiukitsanso, Taona ndiri Wamoyotu.\n" +
                   "\n"),
           new Hymns(6,"6.Wayaka Moto (The Fire Burning)","Ndakhala pa Phiri la Psi’ga, Ndakwaniritsa kukhumba kwa mtima,\n" +
                   "Ndapenuatu ulemerero, Ndipo moyo wanga wayaka.\n" +
                   "\n" +
                   "E. Wayaka moto, motowo ngotentha, E. Wayaka moto m’mtimanga. (x2)\n" +
                   "\n" +
                   "Ndayenda ndi Yesu, ndimtima, Ndikhumba ndikhale wofana naye;\n" +
                   "Chikondi Chake nchonga moto, Ndipo moyo wanga wayaka.\n" +
                   "\n" +
                   "Ndimadzipereka pa guwa; Ngati ndipemphera mwa kukondwera,\n" +
                   "Lawi linyeketsa zoipa, Ndipo moyo wanga wayaka.\n" +
                   "\n" +
                   "Chikhulupiriro chiona, Kuseri kwa nyanja, dziko lokoma, Ndimaona nyali za kwathu, Ndipo moyo wanga wayaka.\n"),
           new Hymns(7,"7.Ndiri ndi Mudzi Wina (I've Got a Home)","Ndiri ndi mudzi wina, wowala kuposa dzuwa, Uko kumwambako.\n" +
                   "\n" +
                   "Mbuye, Mbuye, Mukumbukire ine; Uko Kumwambako.\n" +
                   "\n" +
                   "Ngati susenza mtanda, sungathe kuvala kolona, Uko Kumwambako.\n" +
                   "\n" +
                   "Yesu abwera, abwera posachedwa, Uko Kumwambako.\n" +
                   "\n"),
           new Hymns(8,"8.Sufuna Kupita Nane (Don't You Want to Go With Me?","Uyembekeza mzimu wanga; Kufika kumudzi wanga; Ndidzamuna Mpulumutsi,\n" +
                   "Wofera zoipa zanga.\n" +
                   "\n" +
                   "Sufuna kupita nane: (x 2); Tioleke Yordano, Tilowe mu Kenani, Sufuna kupita nane?\n" +
                   "\n" +
                   "M’Yerusalemu watsopano, Simudzakhala chisoni, Simudzakhala zakulira,\n" +
                   "Za imfa zonse zizatha.\n" +
                   "\n" +
                   "Mpulumutsi andilindira, Wandikonzeratu malo, Mtima wanga uyembekeza,\n" +
                   "Ndilowemo mokondwera"),
           new Hymns(9,"9.Ndiri Ndi Mtendere (Constantly Abiding)","Ndiri ndi mtendere, kale ndinasowa, Mtendere ngwosachoka, Mayeso amoyo akandizingatu, Ndiri ndi mtendere wosatha.\n" +
                   "\n" +
                   "Ndikhala naye, Yesu ngwanga, Ndikhalitsa naye mokondwera; Sindimasungulumwa, anong’oneza;‘Sindidzakusiya,’Yesu ngwanga.\n" +
                   "\n" +
                   "Nyimbo inayaba pamene mtendere; Unalowa m’mtima mwanga; Zovuta zathawa, mdimanso wachoka; Mbuye wodalitsika ndinu.\n" +
                   "\n" +
                   "Chuma ndiri nacho  mchotengera chadothi, Mmene ndiyenda pansi pano; Koma abweranso pa tsiku lodala, Kunditenga kwathu Kumwamba.\n"),
           new Hymns(10,"10.Kwathu Sipadziko (This World Is Not My Home)","Kwathu sipadzilo, ndingopitirira, Ndadzikundikira chuma Kumwambako;\n" +
                   "Mngelo akodola pakhomo la m’Mwamba, Ndipo dzilo lapansi sindiyesa kwathu.\n" +
                   "\n" +
                   "Mbuye ndinu bwenzi langa ndithu; Ndichitenji ngato Kumwamba sikwathu?\n" +
                   "Mngelo akodola pakhomo la m’Mwamba\n" +
                   "Ndipo dziko lapansi sindiyesa kwathu.\n" +
                   "\n" +
                   "Andiyembekeza, chinthuchi ndidziwa; Mpulumutsi wanga wandikhulu’kira;\n" +
                   "Adzandipyoletsa pamene ndafoka, Ndipo dziko lapansi sindiyesa kwathu.\n" +
                   "\n" +
                   "Mayi watsogola ku Ulemerero, Ndifuna kugwira dzanja lake konko,\n" +
                   "Andidikiranso pakhomo la m’Mwamba.  Ndipo dziko lapansi sindiyesa kwathu.\n" +
                   "\n" +
                   "Mu ulemerero tidzakhala mýaya.  Oyera mtimawo ali kulambira, Ati, Haleluya kwa Mulungu wa mphamvu, Ndipo dziko lapansi sindiyesa kwathu.\n"),

           new Hymns(11,"11.Ndiri ndi Nyumba (I've Got a Mansion)","Padziko lino nyumba yanga njochepa, Chuma kulibe, pena khobidi; Koma mumzinda wa onse o’mboledwa, Ndifuna nyumba ya golidi.\n" +
                   "\n" +
                   "Ndiri ndi nyumba kuseri kwa Phiri, M’dziko lijalo lonyezimira; Tsiku linanso sindidzayendanso, Tinka ku nyumba ya siliva.\n" +
                   "\n" +
                   "Timayesedwa, ndipo kuzunzidwa; Ngati mneneri, ntsamiro mwala; Nkana ndiribe nyumba yokhalitsa; Mbuye aninkha chinyumba changa.\n" +
                   "\n" +
                   "Musamayesa ndine wosiyidwa, Sindida nkhawa, kwathu nkumwamba,\n" +
                   "Ndine wogonera wofunatu mzinda, Ndikhumba nyumba ndi zeze wanga.\n" +
                   "\n"),
           new Hymns(12,"12.Ndaomboledwa, Haleluya (Redeemed)","Ndaomboledwa, haleluya, M’mwazi wa Mwana wa nkhosa, Ndaomboledwa mwa chifundo, Ndine mwana’ke kosatha.\n" +
                   "\n" +
                   "‘Mboledwa, ‘mboledwa, Ndi Mwazi ndaomboledwa, ‘Mboledwa, ‘mboledwa, Ndine mwana ‘ke kosatha.\n" +
                   "\n" +
                   "Ndaomboledwa ndakondwera, Chimwemwe nchosaneneka, Kuwalako kwa nkhope yake, Kundiphimba kosaleka.\n" +
                   "\n" +
                   "Ndisinkha za Mombolo wanga,  Ndinsinkhira tsiku lonse,  Ndiyimba, sinditha kuleka,\n" +
                   "Nyimbo za chikondi chake.\n" +
                   "\n" +
                   "Ndidzaona Mfumu yokoma,  Lamulo lake n’labwino, Atchinjiriza njira yanga,\n" +
                   "Kukada padziko lino.\n"),
           new Hymns(13,"13. Chigonjetso Mwa Yesu (Victory in Jesus)","Ndinamva za nkhaniyo, kuti Yesu anatsika, Nadzandifera pa Kalvari, kundipulumutsa; Ndinamva analira pakuombola ochimwa, Nditalapa tchimo langa, pali chigonjetso.\n" +
                   "\n" +
                   "Chigonjetso mwa Yesu, Mpulumutsi wanga; Wandifuna, wandigula ndi Mwazi wo’mbola;\n" +
                   "Wayamba kundikonda, Tere ndimkonda Iye, Wapatsa chigonjetso ndi Mwazi wakewo.\n" +
                   "\n" +
                   "Ndinamva za Mchiritso; pakuonetsa mphamvuzo, Anachiritsa opunduka ndi akhungu omwe; Ndinalira, O, Yesu Mundichiritse inenso; Pomwepo Yesu anandipatsa chigonjetso.\n" +
                   "\n" +
                   "Ndinamva za Kumwamba; amandikonzera malo; Ndinamva za miseuyo, nja golidi konko; Ndi angelo ayimba nkhani yomweyo yodala; Tsiku lina nkayimba nawo za chigonjetsocho.\n"),
           new Hymns(14,"14.Mtendere Wa Mlungu (It is Mine,Mine)","Mtendere wa Mlungu uli m’moyomu, E. ndimaumwa, e ndimaumva; Wachotsa mantha ndi kykayikanso, Nkosafotokozeka.\n" +
                   "\n" +
                   "Uli wanga, wanga, mtima dzinalo, Wandipatsadi mtendere wake, Uli wanga, wanga, mtima dzinalo, Uli wanga kosatha.\n" +
                   "\n" +
                   "Analongamu mpumulo wangwiro; E. ndiri nawo, e ndiri nawo, Amandidalitsa nandisunganso, Nawalitsa mtimanga.\n" +
                   "\n" +
                   "Anandipatsa chimwemwe chosatha, E chiri nacho, e ndiri nacho, Nditamanda ndi mphamvu zanga zonse, Ndimo ndilumbiranso.\n" +
                   "\n" +
                   "M’moyo mwanga muli chikondi chake, E. chiri changa, e chiri changa, Mafunde a chimwemwe andimiaza, Moyo usefukira.\n" +
                   "\n"),

           new Hymns(15,"15.Pansi Pano (Where Could I Go)","Pansi pano padziko lochimwa, Chuma chokwana ndiribe, Pokomana ndi yeso lowawa, Nthawireko kwa Ambuye.\n" +
                   "\n" +
                   "N’thawireko, nthawireko, Kwa Mpulumutsi wa moyo, Pofuna bwenzi potha moyowu\n" +
                   "Nthawireko kwa A mbuye.\n" +
                   "\n" +
                   "Anansi anga ali okoma, Timayanjana bwinotu, Koma posowa Mana amoyo,\n" +
                   "Nthawireko kwa Ambuye\n" +
                   "\n" +
                   "M’moyo uno Akhristu ndakonda, Mawu a Mulungu andikwana, Koma poona dzanja la imfa, Nthawireko kwa Ambuye.\n"),
           new Hymns(16,"16.Ndikhulupirila (I've Believed the True Report","Ndakhulupirira, Haleluya kwa Yesu, Ndalowatu pakhomo, Ulemu kwa Mlungu,\n" +
                   "Pa Guwa Lansembelo ndinadziperekatu, Ndafa ku dziko lino, Haleluya kwa Yesu.\n" +
                   "\n" +
                   "Haleluya haleluya, Ndapyolatu chinsalu chong’ambika ndi Yesu, Haleluya, haleluya,\n" +
                   "Ndakhala m’ulemerero wa Mfumu.\n" +
                   "\n" +
                   "Ndapitirira Mkhate, Haleluya kwa Yesu, Mawu andiyeretsa, Ulemu kwa Mlungu\n" +
                   "M’malo Opatulika Mwazi wandilowetsa, Tiayanjana pa Gome, Haleluya kwa Yesu.\n" +
                   "\n" +
                   "Ndalowa m’kuunika, Haleluya kwa Yesu, Khristu wandiwalira, Ulemu kwa Mlungu.\n" +
                   "Mapemphero angawo, monga pfungo labwino, Akwela kwa Mlunguyo, Haleluya kwa Yesu.\n" +
                   "\n" +
                   "Ndapyolatu chinsalu, Haleluya kwa Yesu, Chong’ambika ndi Yesu, Ulemu kwa Mlungu, Latsegulidwa khomo ndi Mwazi wa Mombolo, Ndiri m’ulemerero, Haleluya kwa Yesu.\n" +
                   "\n"),
           new Hymns(17,"17.Mumtima Mwanga Muli Nyimbo (He Keeps Me Singing","Mumtima mwanga muli nyimbo; Yesu ati m’mawu okoma; ‘Mtendere, msaope ndiripo\n" +
                   "Mwa zovuta za moyo.\n" +
                   "\n" +
                   "Yesu, Yesu, Yesu ; Dzina labwino, Lindikwaniritsa; Lindiyimbitsa nyimbo.\n" +
                   "\n" +
                   "  Ndinaipitsidwa ndi tchimo;  M’mtima munadzaza ndeu, Yesu  anandichiritsadi,\n" +
                   "      Nandiyimbitsa nyimbo.\n" +
                   "\n" +
                   "  Podya zabwino za chisomo, Potsamira mphiko lake, Poyang’ana pa nkhope yake\n" +
                   "     Ndipfuula ndi kuyimba.\n" +
                   "\n" +
                   " Tikaona madzi akuya, Ndi panjira zotipinga, Pa makolokoto tiona\n" +
                   "     Mapazi ake pompo.\n"),
           new Hymns(18,"18. Mwina Timavutika (By and By)","Mwina timavutika pa nyanja ya nsautso, Ndi namondwe akuopsa amalondola dzuwa, Koma m’dziko langwiro zitachoka nkhunguzo, Tidzazindikira bwino patsogolo\n" +
                   "\n" +
                   "Patsogolo mmene mawa abwera, Pamene oyera adzafika kwawo, Tidzanena nthano\n" +
                   "tagonjetsa bwanji, Tidzazindikira bwino patsogolo.\n" +
                   "\n" +
                   "Zofunika zathuzi nzosoweka m’dzikoli, M’thupi njala ndi usiwa m’munda mulibe m’mela; Tikhulupire Mbuye, ndi malinga ndi Mawu, Tidzazindikira bwino patsogolo\n" +
                   "\n" +
                   "M’mbali zonse zovuta nzosozindikirika, Njira zosiyana zonka ku dziko la lonjezo,\n" +
                   "Mlungu adzatisunga mpaka tsiku la imfa, Tidzazindikira bwino patsogolo\n" +
                   "\n" +
                   "Ife mwina tigwidwa ndi msampha wobisika, Mtima upweteka tikanena Mawu olakwa; Tikafunsa chifukwa chomwe timayesedwa, Tidzazindikira bwino patsogolo\n" +
                   "\n"),
           new Hymns(19,"19.Mbiri Njoposa (He is Able to Deliver Thee","Mbiri njoposa ndi kale lomwe; Mbiri njoposa zolankhulidwa, Mbiri njoposa zoyimbiridwa, ‘Mlungu akhozadi kukulanditsa.’\n" +
                   "\n" +
                   "Akhozadi kukulanditsa Akhozadi kukulanditsa, Iwe wochimwa akupumitsa,\n" +
                   "‘Mlungu akhozadi kukulanditsa.’\n" +
                   "\n" +
                   "Mbiri njopisa padziko lonse, Mbiri njoposa kwa anthu onse, Mbiri njoposa, kasimbe monse, ‘Mlungu akhozadi kukulanditsa.’\n" +
                   "\n" +
                   "Mbiri njoposa, ifalitsidwe, Kwa anthu onse ali m’machimo, Yang ‘ana m’mwamba mwa chikhulupiro, ‘Mlungu akhozadi kukulanditsa.’\n" +
                   "\n"),
           new Hymns(20,"20.Mulungu Awakonda Anthu (God Loves)","Mulungu awakonda anthu ali pansi pano, Afuna kuwapulumutsa ku milandu yawo.\n" +
                   "\n" +
                   "A! Chikondi chachikulu, Mulungu ali nacho, Chinan’tengera Mpulumutsi, Andifere pano.\n" +
                   "\n" +
                   "Ndikhulupira mwa Ambuye, Mulungu namuukitsa, Imfayo indipulumutsa, Mwazi undiyeretsa.\n" +
                   "\n" +
                   "Chikondi chake chindidzera m’mtima mwanga muno, Chipulumutsa nditalema ndi machimo anga.\n" +
                   "\n" +
                   "Mukondwe, anthu a Mulungu, tere mulandira, Chimwemwe chija cha Kumwamba, chidzalowa  M’mtima"),
           new Hymns(21,"21.Mzaka Zapitazo (Long Ago)","M’zaka zapitazo, mu Buku la m’Mwamba, Inalimo ngongole ya zoipa zanga,\n" +
                   "Ndimo dzina langa linalembedwamo, Ndinadza kwa Wolemba, ndakonza yathano.\n" +
                   "\n" +
                   "Yathano, yathano, Ngongole ya zoipa yathano, Yesu wafafaniza potsuka mtima wanga\n" +
                   "Analipira ngongole yathano.\n" +
                   "\n" +
                   "Ngongole inakula tsiku ndi tsiku, Pakuti ndinachimwa osalipiratu; Koma poyangána zowawa mtsogolo, Ndati ndizilipira, ndakonza yathano.\n" +
                   "\n" +
                   "Pamene ndifika pampando wa Mbuye, Iye adzatsegula Buku la ngongole, Ngati awonamo zangazo zathamo, Apo ndidzakondwera ndakonza yathano.\n" +
                   "\n" +
                   "Wochimwa bweratu, ulape mtimamo, Kuti ngogole ithe ugwade tsopano, Ukakhala moyo nkana zaka zana, Sudzachita chisoni wakonza yathano.\n"),
           new Hymns(22,"22.Muli Mphamvu (Power in the Blood","Ufuna zithe zochimwa zako? M’mwazi wa Yesu muli mphamvu; Ufuna kugonjetsa zoipa? Mwazi wa Yesu ngwamphamvu.\n" +
                   "\n" +
                   "Muli mphamvu, mphamvu yozizwitsatu, M’mwazi wa Yesuyo, Muli mphamvu, mphamvu yozizwitsatu, M’mwazi wa Mwanawankhosa.\n" +
                   "\n" +
                   "Ufuna kuthe kunyada kwako? M’mwazi wa Yesu muli mphamvu; Idza pa Kalvari nutsukidwe, Mwazi wa Yesu ngwamphamvu.\n" +
                   "\n" +
                   "Ufuna mtima woyeratu mbu? M’mwazi wa Yesu muli mphamvu; Banga la tchimo lichotsedwamo, Mwazi wa Yesu ngwamphamvu.\n" +
                   "\n" +
                   "Ufuna kumtumikira Yesu?  M’mwazi wa Yesu muli mphamvu; Tsiku ndi tsiku kumyamikira? Mwazi wa Yesu ngwamphamvu."),
           new Hymns(23, "23. Potsamila (What a Fellowship)","Pali chiyanjano ndi chimwemwenso, Potsamira pamkono wake, Ndine wodala, mtendere ngwanga, Potsamira pa mkono wake.\n" +
                   "\n" +
                   "Potsamira, potsamira, Ndaphimbidwa kuzoopsa, Potsamira, potsamira, Potsamira pa mkono wake.\n" +
                   "\n" +
                   "Njira njokoma ya ogonera, Potsamira pa mkono wake; Iwalitsidwa tsiku ndi tsiku\n" +
                   "Potsamira pa mkono wake.\n" +
                   "\n" +
                   "Ndioperanji zoopsa zonse, Potsamira pa mkono wake, Pali mtendere pomwe alipo,\n" +
                   "Potsamira pa mkono wake.\n"),
           new Hymns(24,"24.Pinda Bondo (Kneel at the Cross)","Pinda bondo pa Mtanda wake, Yesu alindira, Mvera Iye, tula nkhawazo, Moyo uyambenso.\n" +
                   "\n" +
                   "Pinda bondo, tula nkhawazo, Pinda bondo pa Mtanda wa Yesu.\n" +
                   "\n" +
                   "Pinda bondo pa Mtanda wake, Malo aliponso, Akondwera, mantha alibe, Yemwe anka konko.\n" +
                   "\n" +
                   "Pinda bondo pa Mtanda wake, Siya mafanowo, Osapita ku chipandanso, Khulupira Yesu.\n" +
                   "\n"),
           new Hymns(25,"25.Kumwamba Nkodabwitsa (Wont't it Be Wonderful There?)","Ndi Mpulumutsi tikalowa m’Mwambamo, Kumwamba nkodabwitsa; Nkhawa ndi nsautso zonse zizathamo, Kumwamba nkodabwitsa.\n" +
                   "\n" +
                   "Kumwamba nkodabwitsa, Kopanda zolemetsa, Tidzakaimbamo, Chimwemwe m’mtimamo,\n" +
                   "Kumwamba nkodabwitsa.\n" +
                   "\n" +
                   "Tikachezera ndi Khristu wopasayo, Kumwamba nkodabwitsa, Tidzalambira Yesu wokondedwayo, Kumwamba nkodabwitsa.\n" +
                   "\n" +
                   "Sitiopsedwa ndi namondwe komweko, Kumwamba nkodabwitsa; Atisamala kosatha Ambuyeyo. Kumwamba nkodabwitsa"),
           new Hymns(26,"26.Pa Kalvari (At Calvary)","Kale ndi nali wakunyoza kuti Mbuye wapachikidwa, Wosadziwa anandifera, Pa Kalvari.\n" +
                   "\n" +
                   "Chifundo nchachikulu apo, Ndinakhululukiridwapo, Ine ndinamasulidwapo, Pa Kalvari.\n" +
                   "\n" +
                   "Mawu a Mlungu ananditsutsa, Za lamulo ndinalinyoza, Ndinagwadira ndi kupempha\n" +
                   "Pa Kalvari\n" +
                   "\n" +
                   "Tsono zonse ndampatsa Yesu, Ndikondwera kumyesa Mfumu, Moyo wanga umayimbatu , Za Kalvari\n" +
                   "\n" +
                   "Ha, chikondi chotiombola, Ha, chisomo chotitukula, Phompho Yesu walioloka\n" +
                   "Pa Kalvari.\n"),
           new Hymns(27,"27.Moyo Wanga Wasinthika(Since Jesus Came into My heart)","Moyo wanga wasinthika modabwitsa, Walowa mtimanga Yesu, Kuunika kwalowa, waleka mdima, Walowa mtimanga Yesu.\n" +
                   "\n" +
                   "Walowa mtimanga Yesu, Walowa mtimanga Yesu, Ndamizidwa m’mafunde a chimwemwecho, Walowa mtimanga Yesu\n" +
                   "\n" +
                   "Ndaleka kuyenda ndi kulowerera, Walowa mtimanga Yesu, Anachoka machimo mu mwazi wake, Walowa mtimanga Yesu.\n" +
                   "\n" +
                   "Chiyembekezo changa chakhazikika, Walowa mtimanga Yesu, Tsono sindikayika panjira yanga, Walowa mtimanga Yesu.\n" +
                   "\n" +
                   "Ndidzapita kukhala munzinda wake, Walowa mtimanga Yesu, Ndakondwera koposa poyembekeza, Walowa mtimanga Yesu.\n"),
           new Hymns(28,"Ndaima Nji (The Solid Rock","Chiyembekezo changacho, Chamagidwa pa Mwaziwo; Sindikhulupira ena Ndingotsamira pa yesu\n" +
                   "\n" +
                   "Ndaima nji pa Khristuyo; Ndiye chitanthwe cholimba; Maziko ena ndi mchenga.\n" +
                   "\n" +
                   "Nkhope yake ‘kabisika, Ndipuma mchisomo chake; M’namondwe ndi mphepo zonse\n" +
                   "Nangula wanga ali nji.\n" +
                   "\n" +
                   "Pangano lake m’Mwaziwo, Lindisunga m’chigumula, Zondizinga zikachoka\n" +
                   "Yesu ndiye tankthwe langa.\n" +
                   "\n" +
                   "Likalira lipengalo, Ndipezeke mwa Yesuyo, Wovekedwa wolungama\n" +
                   "Wopanda banga konseko.\n"),
           new Hymns(29,"29.Tiyende Ku Zion (Come Ye that Love the Lord)","Idzani nonsenu okonda Yesuyo, Tiyimbe nyimbo yabwino (anso), Ku mpando wakewo (anso)\n" +
                   "\n" +
                   "Tiyende ku Zioni, Mzinda wokomatu Zioni, Tirikukwera ku Zioni, Ndi Mzinda wa Mulungu\n" +
                   "\n" +
                   "Ngakhale enawo aleke kwimbako, Akhristu’fe tidziyimba (anso), Kumlemekeza’ye (anso)\n" +
                   "\n" +
                   "Akhristu tonsefe, Tikondwe ndzikoli, Koposa anthu enawo (anso) Tisanafikeko (anso)\n" +
                   "\n" +
                   "Tiyimbe mokondwa, misozi iume, Poyenda kunka kwathuko (anso) Kwa Mlungu wathuyo (anso)\n"),
           new Hymns(30,"30. Mu Mtanda (Near the Cross)","Yesu mundisungetu pafupi ndi Mtanda, Komwe mtsinje ugwera, wochiritsa anthu\n" +
                   "\n" +
                   "Mu Mtanda, mu Mtanda ndidzitamandire; Mpaka moyo upuma kuseri kwa mtsinje.\n" +
                   "\n" +
                   "Pa Mtanda moyo wanga wapeza chifundo, Pomwe Nthanda yokoma indiunikira.\n" +
                   "\n" +
                   "Pa Mtanda, Mlungu wanga, ndipakumbukire, Nd’yende tsiku ndi tsiku, m’mthunzi wake momwe.\n" +
                   "\n" +
                   "Pa Mtanda ndidikire, ndikhulupirire, Mpaka tikomaneko kuseri kwa Mtsinje.\n"),
           new Hymns(31,"31.Chisomo Chodabwitsatu","Chisomo chodabwitsatu chondipulumutsa, Wotayika wapezeka, wakhungu waona.\n" +
                   "\n" +
                   "Chisomo chalowa m’mtima kudzainga mantha, Chamtengo wake kwa ine pamene ntakolwa.\n" +
                   "\n" +
                   "Chisomo chandipyoletsa m’ngozi ndi nsautso, Chisomo chinditsogola, ndifike kwathuko.\n" +
                   "\n" +
                   "Titakhala Kumwambako zaka zikwi zikwi, Padzakhala zikwi zomwe zomthokoza Mlungu."),
           new Hymns(32,"32.Munthu Wa Zisoniyo (Man of Sorrows)","Munthu wazisoniyo, timcha dzina lakelo; Mpulumutsi dzinanso, Aleluya, ndiye Yesu.\n" +
                   "\n" +
                   "Anapeputsidwako, nandifera m’mtandamo; Anandiombolayo, Aleluya ndiye Yesu.\n" +
                   "\n" +
                   "Ife tinachimwadi, Iye sanachimwa bi; Anachotsa tchimoli, Aleluya ndiye Yesu\n" +
                   "\n" +
                   "Anapachikidwatu nantha ntchito yake myu! Anakwera m’Mwamba du! Aleluya ndiye yesu.\n" +
                   "\n" +
                   "Adzabwera Iyenso kudzatenga akewo; Nyimbo tidzayimbanso, Aleluya ndiye Yesu.\n"),
           new Hymns(33,"33. Kuli Mtsinje Wochiza (Healing Waters)","Achimwemwe ndi onse otsukidwa m’Mwaziwo, Mtendere uli konko, kuli Mtsinje wochiza.\n" +
                   "\n" +
                   "Kuli mtsinje wochiza, chimwemwe chitsikira, Ndi mtendere\n" +
                   "komweko, kuli  mtsinje mwochiza.\n" +
                   "\n" +
                   "Ndipachikidwa naye, ndapumula pa Yesu.  Ndikhalitse komweko; Kuli mtsinje wochiza\n" +
                   "\n" +
                   "E. chikondi changwiro, chimasunga mtimanga, Chigwera mgwero m’Mwamba, kuli mtsinje wochiza.\n" +
                   "\n" +
                   "Ndatsamira pa Yesu mu namondwe wa moyo, Mtendere uchokako, kuli mtsinje wochiza.\n" +
                   "\n"),
           new Hymns(34,"34.Adzaoneka (We shall See the King","Posachedwa litcha tsiku lodala, Nkana nthawiyo njosadziwika,\n" +
                   "Alumikizidwa Khwatibwi ndi Mkwati, Adzaoneka Mfumuyo.\n" +
                   "\n" +
                   "Adzaoneka, adzaoneka, adzaoneka, Mfumuyo, Abwera ndi mphamvu, tidzamlambiratu, Adzaoneka Mfumuyo.\n" +
                   "\n" +
                   "Kodi wakonzeka akaitana? Ntchito zako zidzankondweretsa?\n" +
                   "Mafumu am’dziko adzamlambiratu, Adzaoneka Mfumuyo.\n" +
                   "\n" +
                   "Kodi mbale wamva akuitana? Wampatsa ufumu m’mtima mwako?\n" +
                   "Mafumu am’dziko adzamlambiratu, Adzaoneka Mfumuyo.\n" +
                   "\n"),
           new Hymns(35,"35. Kodi ndalembedwa ? (Is My Name Written There)","Mbuye sindisamala za chuma cha dziko, Ndidziwe za Kumwamba, kuti ndilowemo; M’buku la ufumu wanu, pa tsamba loyera, Ndiuzenitu Yesu, kodi ndalembedwa?\n" +
                   "\n" +
                   "Kodi ndalembedwa; patsamba loyera? M’buku la Ufumu wanu;\n" +
                   "kodi ndalembedwa?\n" +
                   "\n" +
                   "Mbuye zoipa zanga zimaposa mchenga, Koma Mwazi wa Mtanda udzandisambitsa; Lonjezano linena, ngakhale zoipa; Zikafiira, zidzayera ngati matalala.\n" +
                   "\n" +
                   "Kuli Mzinda wokoma, ndi nyumba zowala, Anthu oomboledwa avala zoyera; Mommo simudzalowa ndi kanthu kodetsa, Ndi angelo adika, kodi mwalembedwa?\n" +
                   "\n"),
           new Hymns(36,"36.Kale Ndinali Wochimwa (Hallelujah Side)","Kale ndinali wochimwa, ndi kutali ndi Yesu, Koma ndinalira kwa Mpulumutsi; Anandiveka ndi nsalu, nandibweza m’kholamo, Tsono ndiri m’mbali halelya.\n" +
                   "\n" +
                   "Timlemekeze Yesu, tiwonge haleluya, Tiyimbe thamo lake kutaliko; Ndamtsegulira Ambuye mazenera a moyo, Tsono ndiri m’mbali ya haleluya.\n" +
                   "\n" +
                   "Nkana dziko lindikopa nazo zokoma zake, Koma sindisirira zachabezo,\n" +
                   "Kaamba ka maso amoyo apenyetsa za m’Mwamba, Tsono ndiri m’mbali ya haleluya\n" +
                   "\n" +
                   "Malo ano sindinthana ndi zonse zam’dziko; Ngati Mdielekezi akandiyesa,\n" +
                   "Ine nditchinjirizidwa ndi chikondi cha Mulungu, Tsono ndiri m’mbali ya haleluya.\n" +
                   "\n" +
                   "Mmene ndifika kutsidya, kuli ulemerero, Nditadzaoloka Mtsinje wa Imfa,\n" +
                   "Ndidzafuula Haleluya pakhomo la Kumwamba, Ndidzafika m’mbali ya haleluya.\n" +
                   "\n"),
           new Hymns(37,"37. Tamva Mbriri Yodala (Jesus is Coming)","Tamva mbiri yodala za kudza Yesu; Yesu abwera, haleluya; Tsono padziko yagwa mvula ya masika, Yesu abwera, haleluya.\n" +
                   "\n" +
                   "Yesu abwera, abwera ndithu; M’ulemerero, Mfumu yathu;  Kondwerani anthunu\n" +
                   "muyimbe nyimboyi, Yesu abwera, haleluya.\n" +
                   "\n" +
                   "Tiona zizindikiro tsiku ndi tsiku; Yesu abwera, haleluya, Tsono mitima ya anthu yagwidwa mantha; Yesu abwera, haleluya.\n" +
                   "\n" +
                   "Tifalitse uthenga kuseri kwa nyanja, Yesu abwera, haleluya, Kuti Mfumu ya mafumu abwera msanga, Yesu abwera, haleluya.\n" +
                   "\n" +
                   "Idzani msanga Karonga wa mtenderenu, Yesu abwera, haleluya, Liche tsiku lobweza kumasuka kwa imfa, Yesu abwera, haleluya"),
           new Hymns(38,"38. Likaliratu Lipenga (When the Roll is Called)","Likaliratu lipenga, ndipo nthawi idzatha; Kukacha tsiku loyera koti mbe,\n" +
                   "Akosankhanitsa anthu oyera pa tsidyalo, Pakuitana ndidzakhala komweko.\n" +
                   "\n" +
                   "Pakuitana dzina langa; Pakuitana dzina langa; Pakuitana dzina langa; Pakuitana ndidzakhala komweko.\n" +
                   "\n" +
                   "Mmawa muja akufa mwa Khristu adzauka, Nadzamva mpamvu ya kuuka kwake, Akafika osankhidwawo kuseri kwa thambo, Pakuitana ndidzakhala komweko.\n" +
                   "\n" +
                   "Timutumikire Mbuye usana ndi usiku, Tilankhule za chikondi chakecho,\n" +
                   "Tsono moyo ukadzatha,ikaleka ntchitoyi, Pakuitana ndidzakhala komweko.\n"),
           new Hymns(39,"39.Tiime Pa Malonjezano (Standing on the Promises","Tiime pa malonjezano a Mlungu, A Khristu Mfumu yathu, timtamande,\n" +
                   "Ulemerero ukhale kwa Mlungu, Tiime pa malonjezanowo.\n" +
                   "\n" +
                   "Tiime, time, Tiime pa malonjezano a Mulungu, Tiime, time, Tiime pa malonjezanowo.\n" +
                   "\n" +
                   "Tiime pa malojezano a Mlungu,Pakuomba mphepo zakukayika, Ndi Mawu Amoyo tidzapyolatu, Tiime pa malonjezanowo.\n" +
                   "\n" +
                   "Tiime pa malonjezano a Mlungu, Momwe muli kutsukidwa ndi Mwazi,\n" +
                   "Tiime pa ufulu uli mwa Yesu, Tiime pa malonjezanowo.\n" +
                   "\n" +
                   "Tiime pa malonjezano a Mlungu, Timangidwe kwa Mbuye ndi chikondi,\n" +
                   "Tigonjetse ndi lupanga la Mzimu, Tiime pa malonjezanowo.\n" +
                   "\n"),
           new Hymns(40,"40.Lero Khritsu Adauka (Christ Is Rissen Today)","Lero Khristu anauka, Ndilo tsiku lokondwera; Iye kale anafera naombola otayika, Haluluya, haleluya, haleluya, haleluya.\n" +
                   "\n" +
                   "Tiyimbire zomtamira; Ndiye Khristu wa Kumwamba, Natsikirako kumanda, nalanditsa auipa, Haluluya, haleluya, haleluya, haleluya\n" +
                   "\n" +
                   "Koma masaulo ake anatiombola ife, Ndiye Mfumu ya mafumu, Mwana ndithu wa Mulungu. Haluluya, haleluya, haleluya, haleluya.\n" +
                   "\n" +
                   "Tiyimbire Mlungu wathu, kuti atikonda ndithu, Mtamenso angelo inu,\n" +
                   "Ndiye Tate, Mwana, Mzimu. Haluluya, haleluya, haleluya, haleluya.\n"),
           new Hymns(41,"41.Tidikirira (Waiting on the Lord)","Tidikirira, lonjezano lake, Tidikirira lititsanulidwe, Tidikiira kuti tilandire,\n" +
                   "Mçhapinda cha pamwamba.\n" +
                   "\n" +
                   "Mphamvu mphamvu, Igonjetsa tchimo, ilonga chiyero; Mphamvu mphamvu\n" +
                   "Ndi mphamvu ya pa Pentekoste.\n" +
                   "\n" +
                   "Tidikirira kupatsa Yesu zonse, Tidikirira ku tchimo timasuke; Tidikirira mphepo ya Kumwamba; M’chipinda cha pamwamba.\n" +
                   "\n" +
                   "Tidikirira kuti tiswerenso, Tidikirira ndi chilakolako; Tidikirira moto wa\n" +
                   "Kumwamba; M’chipinda cha pamwamba.\n"),
           new Hymns(42,"42. Kodi Ufuna Chidzalo (Bring your Vessels)","Kodi ufuna chidzalo cha madalo a Mbuye, Mu mtima mwako lero?\n" +
                   "Fumbata  malonjezano, bwera monga mwa Mawu, Mnjira yomwe yakale.\n" +
                   "\n" +
                   "Adzadzaza mtima wako wonse lero, Monga Mbuye wanena, bwera ndi zotengera;\n" +
                   "Adzadzaza mtima wako wonse lero; Ndi Mzimu Woyerayo.\n" +
                   "\n" +
                   "Bera ndi chiwiya chako chotsukidwa ndi Mwazi, Bweratu wosowa’we,\n" +
                   "Mtima wonse upereketu pamaso pa Mlungu, Ugwa Mzimu Woyera.\n" +
                   "\n" +
                   "Ngati mafuta osaphwa ndi chisomo cha Mlungu, Ndi chikondi chakenso;\n" +
                   "Moingana ndi lonjezo la Mzimu ndi mphamvuyo, Adzadzaza monsemo.\n"),
           new Hymns(43,"43.Tumizani,Tumizani( Send the Fire)","Ndinu Khristu wotumiza moto; Tumizani, tumizani, tumizani; Lorotu tilandire mphatsoyo, Tumizani, tumizani, tumizani; Onani tilikudikira\n" +
                   "Lonjezo la Mzimu Woyera, Tifna Pentekoste wina; Tumizani, tumizani,tumizani.\n" +
                   "\n" +
                   "Mulungu wa Eliya mutimve, Tumizani, tumizani, tumizani; Mutikonzere moyo ndi imfa, Tumizani, tumizani, tumizani, Moto upseleze zoipa,\n" +
                   "Uwale m’kati mwa mitima, Utsitsimutse ofaifa; Tumizani, tumizani, tumizani.\n" +
                   "\n" +
                   "Motowo tifuna, tipemphera, Tumizani, tumizani, tumizani, Udzakwanitsa kusowa kwathu, Tumizani, tumizani, tumizani. Kuti tisenze zolemera,\n" +
                   "Kuti tiletse zotithera, Kuti tiyende moyenera, Tumizani, tumizani, tumizani"),
           new Hymns(44,"44. Ndisimba Nkhani Yodala(He Ransomed Me)","Ndisimba nkhani yodala za Khristu wotsika Mwamba, Kudzandifuna, kundipulumutsa; Mwa chifundo anasika, ku tchimo wandianditsa,\n" +
                   "Haleluya, wandiombola.\n" +
                   "\n" +
                   "Haleluya Mpulumutsi anganyamule wochimwa, Namturutsa ku thope la zoipa,\n" +
                   "Ndimakonda kusimbira ndi kupfuula Haleluya, Haleluya, wandiombola.\n" +
                   "\n" +
                   "Kuchokera ku chisoni mpaka ku chimwemwe chokha, Wanditukula mwa chifundo chake, Ndi Mwazi anandigula, ndatayika, wandifuna,\n" +
                   "Mwa chikondi wandiombola\n" +
                   "\n" +
                   "Kuchokera mpando wake wachifumu wa Kumwamba, Anadza Yesu kwa otayikawo, Nalanditsa omangidwa ndi chisomo chodabwitsa, Haleluya, wandiombola.\n" +
                   "\n" +
                   "Posachedwa ndokondwera ndi chimwemwe chosaleka, Khristu abera\n" +
                   "kudzandikwatula, Komwe ndi oyera mtima  n’dzayimba mosefukira,\n" +
                   "Za Mfumu yokundiombola.\n"),
           new Hymns(45,"45. Wachotsa Zoipa(He Took My Sins Away) ","Ndinabwera kwa Yesu mofooka, Wachotsa zoipa, wachotsa zoipa,\n" +
                   "Tsono m’chikondi chake ndakondwa, Wachotsa zoipa.\n" +
                   "\n" +
                   "Wachotsa zoipa, wachotsa zoipa,  Masiku onse ndiyimba; Ndakondwa wachotsa\n" +
                   "zoipa, Wachotsa zoipa.\n" +
                   "\n" +
                   "Ndinathodwa ndi zochimwa zanga, Wachotsa zoipa, wachotsa zoipa,\n" +
                   "Ndatula mtolo wanga pa Yesu, Wachotsa zoipa.\n" +
                   "\n" +
                   "Kutsutsika kwa m’mtima kwathano, Wachotsa zoipa, wachotsa zoipa,\n" +
                   "Wandipatsa mtendere wangwiro, Wachotsa zoipa.\n" +
                   "\n" +
                   "Ngati ubwera kwa Yesu lero, Achotsa zoipa, achotsa zoipa,\n" +
                   "Adzakusunga, m’chikondi chake, Achotsa zoipa.\n"),
           new Hymns(46,"46. Musandipitile Yesu (Pass Me Not O Gentle Saviour) ","Msandipitirire Yesu, Mundimvere ine, Mulikudalitsa ena, Msandipitirire.\n" +
                   "\n" +
                   "Yesu, Mbuye, khutu munditchere, M’mene muitan ena, Msandipitirire.\n" +
                   "\n" +
                   "Ndigwadira inu Yesu, Musandikanize, Ndikalapatu machimo,\n" +
                   "Mbuye mndithandize.\n" +
                   "\n" +
                   "Nkhope yanu ndifunitsa, sindiyenera konse, M’mtima mwanga muchiritse, nthenda zanga zonse.\n" +
                   "\n" +
                   "Yesu, ndinutu chitsime cha chimwemwe chokha, Sindifuna wina konse, koma "),
           new Hymns(47,"47.Idza Wolema (Rest of the Weary)","⦁\tIdza wolema akupumitsa, Womva chisoni kutonthoza; Mlendo limbika,\n" +
                   "mphamvu apatsa, Amatisunga,Yesu Ambuye.\n" +
                   "\n" +
                   "⦁\tNdiye mtsamiro pogona ine Pofuna kufa andidzutsanso, Podzichepetsa\n" +
                   "andifupira, Moyo wa moyo, yesu Ambuye\n" +
                   "\n" +
                   "⦁\tNdikakhumudwa andilimbitsa, Ndikadzitama andichepetsa, Ndikasochera andilondola, E. wokondedwa Yesu Ambuye.\n" +
                   "\n" +
                   "⦁\tNdimachitira Inu umboni, Ndikukuzani  moyamikira, Mphamvu ndi nzeru ,\n" +
                   "moyo zonsezi, Sizanga, nzanu, Yesu  Ambuye.\n"),
           new Hymns(48,"48. Kodi Mwasambamo ?(Are You Washed?)","⦁\tMwadzera kwa Yesu kudzatsukidwa, Kodi mwasamba m’Mwazi wake?\n" +
                   "Mukhulupira chisomo chake, Kodi mwasamba m’Mwazi wake?\n" +
                   "\n" +
                   "Kodi mwasambamo, M’mwaziwo wa Mwanawankhosa? Zovala nzoyera zopanda banga, Kodi mwasamba m’Mwazi wake?48\n" +
                   "\n" +
                   "⦁\tMwayenda pamodzi ndi Mpulumutsi, Kodi mwasamba m’Mwazi wake?\n" +
                   "Mwatsamira mwa Wopachikidwayo, Kodi mwasamba m’Mwazi wake?\n" +
                   "\n" +
                   "⦁\tPodza Mkwati nsalu zanu ziyere, Kodi mwasamba m’Mwazi wake?\n" +
                   "Moyo wanu ukonzekere m’Mwamba, Kodi mwasamba m’Mwazi wake?\n" +
                   "\n" +
                   "⦁\tTaya nsanza zodetsedwa ndi tchimo, Kodi mwasamba m’Mwazi wake?\n" +
                   "Kuli chitsime chotsuka m’yoyo, Usambe m’Mwazi wa Yesuyo.\n"),
           new Hymns(49,"49.Umo Mu Ulemerero (Just Over in Gloryland)","⦁\tAndikonzera nyumba Kumwamba, Umo mu ulemerero; Tsono ndikhumba kunka kwa Mbuye, Umo mu ulemerero.\n" +
                   "\n" +
                   "Umo mu ulemerero, Ndidzayimba ndi angelo, Umo mu ulemerero, Umo mu ulemerero, Nkaimba ndi oyerawo, Umo mu ulemerero.\n" +
                   "\n" +
                   "⦁\tNdiri panjira kunyumba zija, Umo mu ulemerero, Ndidzathokozatu ndi kuyimba, Umo mu ulemerero.\n" +
                   "\n" +
                   "⦁\tNkamuona Mbuye, tsilu lodala, Umo mu ulemerero, Ndidzakhalitsa nthawi za m’yaya, Umo mu ulemerero.\n" +
                   "\n" +
                   "⦁\tOsambitsidwa m’Mwazi wa Yesu, Umo mu ulemerero, Ati, Hosana kwa Mfumu Khristu, Umo mu ulemerero.\n"),
           new Hymns(50,"50. Ndachokela Ku Undende (Camping in Canaan Land)","⦁\tNdachokera ku undende, ndi chuma chadzilo, Ndayenda kudziko\n" +
                   "kumene kuli chikondi,Ndasintha dziko lowawa ndi dziko lokoma,\n" +
                   "Ndalowa, ndalowa mu dziko la Kanan’.\n" +
                   "\n" +
                   "Ndakondwa ndalowa, mu dziko la Kenan’, Kukongola kwake nkodabwitsa popenya,\n" +
                   "Nditi, haleluya, m’dziko la Lonjezo, Ndalowa, ndalowa m dziko  la Kanan’.\n" +
                   "\n" +
                   "⦁\tNdachokera ku Aigupto, ku dziko lamdima, Ndayenda m’dzigwa ndi mapiri a Chipululu, Ndafika m’Dziko la kwathu, tsono ndapumula, Ndalowa, ndalowa mu dziko la Kanan’.\n" +
                   "\n" +
                   "⦁\tNdafika ku dziko lomwe lidalonjezedwa, Ulendo wanga wathera m’dziko lokongola; Ndatsogozedwa nd Yesu ku dziko ka kwathu, Ndalowa, ndalowa mu dziko la Kanan’.\n"),
           new Hymns(51,"Paulendo M'dzikoli( O I Want to See Him )","⦁\tPa ulendo m’dzikoli ndimayimbatu, Ndiloza ochimwawo Mwazi wa Yesu,\n" +
                   "Mivi imandilasa m’moyo mwangamu, Koma ndi Mlanditsi ndilakikatu.\n" +
                   "\n" +
                   "O kuona nkhope ya Mbuye wanga; Kuyimbako nyimbo zoyamikira, M’makwalala momwe ndidzahezera, Nthawi ya muyaya kwathu Kumwamba.\n" +
                   "\n" +
                   "⦁\tPotumikira Mbuye mu usiku bii, Ndiphatikira Yesu, ndiye Nyalidi,\n" +
                   "Satan amatchera khwekhwe loipa, Komatu Yesuyo anditsogola.\n" +
                   "\n" +
                   "⦁\tPakuyenda m’chigwamu, ndiona Phiri, Pomwe Yesu apenya nkhondo ya pansi, Atambasula dzanja ku chigwa chini, Zoona, ndidzuka ku chigonjetso.\n" +
                   "\n" +
                   "⦁\tPamafunde akulu m’nyanja ya moyo, Yesu ayendetsatu bwato langalo,\n" +
                   "Aongolera m’madzi pansi panoli, Bwenzi ndi Mthandidzi, ndimamkondadi.\n"),
           new Hymns(52,"52.Lodabwitsa Tsiku (Twas a Glad Day)","⦁\tNdinapezeka ndili wochimwa, Zingwe za dzikoli zinandimanga,\n" +
                   "Tsono tchimo ndi nsoni zinatha, M’mene anandimasula.\n" +
                   "\n" +
                   "Lodabwitsa tsiku lijalo, Yesu anandinyamulamo, Tchimo naliponya m’njanja\n" +
                   "Chimwmwe chinadzadza moyo wanga; Lodabwitsa O haleluya; Lodabwitsa wandisankha, Ndidzafuula, Hosana Kumwamba, Pakumuona Mbuye wanga.\n" +
                   "\n" +
                   "⦁\tAngelo a Kumwamba akondwa, Kukondwako kwamveka m’moyo mwanga,\n" +
                   "Ndipo mtima wanga umayimba; Za Yesu wondiombola.\n" +
                   "\n" +
                   "⦁\tO chimwemwe pokomana kwathu, Mu nyumba ya ‘Tate, Kumwamba konko,\n" +
                   "Tidzakamba kosaleka  nkhani ,Ya chikondi Mombolo"),
           new Hymns(53,"53.E.Ndidziwa","⦁\tIdzani ochimwa nonse, ku Mwazi woyeretsa, Watsuka wochimwitsitsa, pakundipulumutsa.\n" +
                   "\n" +
                   "E. ndidziwa, e. ndidziwa, Mwazi wake ungatsuke ochimwa, E. ndidziwa e. ndidziwa\n" +
                   "Mwazi wake ungatsuke ochimwa.\n" +
                   "\n" +
                   "⦁\tAlimbikitsa wofoka, apyoletsa m’mapiri, Avumbitsa m’chipululu, awalitsa m’usiku.\n" +
                   "\n" +
                   "⦁\tM’mayesero ali mfupi, agonjetsa za imfa. Atsogola m’njira monse, Chisomo akupatsa.\n" +
                   "\n" +
                   "⦁\tAkusunga nthawi zonse, nthawi za muyayanso, Zovuta za dziko lino zikuchitira ubwino.\n" +
                   "\n"),
           new Hymns(54,"54.Yang'anani Anthu Nonse (Tune Land of Beulah)","⦁\tYang’anani anthu onse, Yesu Ambuye wathuyo; Alikudza ndi ulemu,\n" +
                   "kuoneka m’mwambamo.\n" +
                   "\n" +
                   "Yesu Mwana wa Mulungu, anthu onse amlambire, Alikudza ndi ulemu,\n" +
                   "Wopambana, indetu.\n" +
                   "\n" +
                   "⦁\tAdzatenga anth ke, akumverapansipa, Iwo adzakhalanaye m dziko la Kumwambako.\n" +
                   "\n" +
                   "⦁\tKoma anthu oneomweanamnyoza pansipo, Nthawi Yesu alikuadzaopa m’mtimamo.\n" +
                   "\n" +
                   "⦁\tIfe tonse tikumbuke Mawu ake onsewo, Timuyang’anire Iye, Yesu Mbuye wathuyo.\n" +
                   "\n"),
           new Hymns(55,"55.Pa Mthunzi ndi Msipu (God Leads Us Along)","⦁\tPa mthunzi ndi msipu wobiliwira; Mlungu atitsogolera; Pomwe pali madzi\n" +
                   "oziziritsa, Mlungu atitsogolera.\n" +
                   "\n" +
                   "Ena m’namondwe, ena m’madzi, Ena mu moto, tonse mu Mwazi; Ena m’chisoni,\n" +
                   "koma Mulungu; Apatsa nyimbo monse m’mavuto.\n" +
                   "\n" +
                   "⦁\tPa phiri pomwe dzuwa likuwala, Mlungu atitsogolera, Pena mu chigwa muli\n" +
                   "mdima bii, Mlungu atitsogolera.\n" +
                   "\n" +
                   "⦁\tNgakhale Satana atisautsa, Mlungu atitsogolera; Chisomo chitigonjetser’\n" +
                   "adani, Mlungu atitsogolera.\n" +
                   "\n" +
                   "⦁\tKutali kuthope tinachokako, Mlungu atitsogolera, Kutali Kumwamba ku nthawi zonse, Mlungu atitsogolera.\n"),
           new Hymns(56,"56.Khritsu Anatiombola (What a WOnderful Saviour)","⦁\tKhristu anatiombola, Mlanditsi wodabwitsa, Dipo analilpira, Mlanditsi wodabwitsa.\n" +
                   "\n" +
                   "Mlanditsi wodabwitsa, ndi Yesu Mbuy’anga, Mlanditsi wodabwitsa, ndi Yesu Mbuye.\n" +
                   "\n" +
                   "⦁\tNdiyamikira Mwaziwo, Mlanditsi wodabwitsa, Wondibwezera kwa Mlungu, Mlanditsi wodabwitsa.\n" +
                   "\n" +
                   "⦁\tWasambitsa mtima wanga, Mlanditsi wodabwitsa, Tsono ali Mfumu yanga, Mlanditsi wodabwitsa.\n" +
                   "\n" +
                   "⦁\tAli nane njira yonse, Mlanditsi wodabwitsa, Andisunga nsiku zonse, Mlanditsi wodabwitsa.\n" +
                   "\n" +
                   "⦁\tAmanditsira mphamvu, Mlanditsi wodabwitsa, Zoti ndigonjetseretu, Mlanditsi wodabwitsa.\n" +
                   "\n"),
           new Hymns(57,"57. Kuchokera Zoipa Zakuya (Jesus Has Lifted Me","⦁\tKuchokera zoipa zakuya, Ndatukulidwa ndi chikondicho, Ku unyolo wanga ndamasuka, Yesu wanditukula\n" +
                   "\n" +
                   "Ananditukula, ananditukula, Ku mdimawo mpaka kunika Yesu wanditukula,\n" +
                   "\n" +
                   "⦁\tKuchokera ku dziko lapansi, Mpaka Mpumulo wa Kumwambako\n" +
                   "Ndidzakhala ndi oomboledwawo, Poti wanditukula.\n" +
                   "\n" +
                   "⦁\tKuchokera ku zokhumba zanga, Ndalowa mwa Wokondedwa waga,\n" +
                   "Ndidzamuona nthawi za muyaya, Yesu wanditukula.\n" +
                   "\n"),
           new Hymns(58,"58. Inde Ndifuna Kumvatu (More About Jesus)","⦁\tInde, ndifuna kumvatu za chindi’ chake chomwecho, Cha Yesu Mbuye wangayo, zomwe anamva kalelo,\n" +
                   "\n" +
                   "E, zina za Yesu, e, zina za Yesu; Inde ndilira m’mtimamu, Chipulumutso chacheecho.\n" +
                   "\n" +
                   "⦁\tZina za Yesu ndimvetu, kuti ndichitie zakezo, Mzimu Woyera mudzetu,ndiphunzitseni zonsezo.\n" +
                   "\n" +
                   "⦁\tYesu ndi m’mawu mwakemo, Inde ndicheza nayeyo, Liwu ndimamva m’Bukumo, Ndilola Yesu Mbuyeyo.\n" +
                   "\n" +
                   "⦁\tZina za Yesu m’Mwambamo, Ali pampando pakepo, Udze ufumu wakewo, Ndiyetu Mfumu ponsepo"),
           new Hymns(59,"59. Kodi Mungawamve Mbale?(Tis a Glorius Church)","⦁\tKodi mungawamve mbale, akudza m’kuunika? Avala zonyezimira, zotsukidwa m’Mwaziwo.\n" +
                   "\n" +
                   "Mpingo ngokoma wopanda banga, Wotsukidwa mu Mwazi, Mpingo ngokoma wopanda banga, Wotsukitsa mu Mwazi.\n" +
                   "\n" +
                   "⦁\tKodi zikumveka nyimbo, zirikudzaza thambo? Ndizo nkhondo zogonjetsa, Mbendela zingoti njo!\n" +
                   "\n" +
                   "⦁\tMsaope mtambo wansini, pena mphepo za ntchito, Tidzagonjetsa zonsezo, chimwemwe chiyambemo.\n" +
                   "\n" +
                   "⦁\tKweza mbendela ndi mpfuu, tigonjetsatu msanga, Tirikunka kwa Mgonjetsi, tikalamule m’mwamba.\n"),
           new Hymns(60,"60. Potsamira Mkono (Just Lean Upon)","⦁\tPotsamira mkono wa Yesu, Anthangata’we, athangata’we, Pokhalira m’chikondi chake, Udzayimba nyimbo.\n" +
                   "\n" +
                   "Tsamiratu pa mkono wake, Tsamiratu, pali chifundo, Tsamiratu, yang ‘ana m’Mwamba, Utsamire pa Yesu.\n" +
                   "\n" +
                   "⦁\tPotsamira mkono wa Yesu, Awalitsira pa njira yanu, Ungomtsata, akutsogoza, Umvere Mawu ake.\n" +
                   "\n" +
                   "⦁\tPotsamira mkono wa Yesu, Utula nkhawazo, tula nkhawa,\n" +
                   "Katundu umathodwa naye, Umpatse kwa Mbuye.\n" +
                   "\n" +
                   "⦁\tPotsamira mkono wa Yesu ; Akwaniritsa zosowa zako; Onse amene amlandira; Ali bwenzi lawo"),
           new Hymns(61,"61.Konda Dzinalo La Yesu","⦁\tKonda dzinalo la Yesu, mwana wosauka’we, Ndilo lothandiza anthu, khala nalo ponse phe!\n" +
                   "\n" +
                   "Dzina la Yesuyo, lokondwetsa onsewo, M’mwambamo, ponsepo, litonthoza mtimamo.\n" +
                   "\n" +
                   "⦁\tKonda dzinalo la Yesu, m’moyo mwako monsemo; M’mene ulikuyesedwa, tchula dzina lakelo.\n" +
                   "\n" +
                   "⦁\tDzina ili ndi lokoma, la Mombolo wathuyo, M’mene adzatilankdira m’Mwamba, tidzakondwako.\n" +
                   "\n" +
                   "⦁\tMbuye Yesu timtamanda ndi zinymbo zathuzi, Mfumu ya mafumu onse Yesu timayesadi.\n"),
           new Hymns(62,"62. M'phiko Mwake(Under His Wings)","⦁\tM’phiko mwake ndakhalamo modala, Mkana m’namondwe ndi m’usiku bii,\n" +
                   "Ndinkhulupira, adzandisungabe, Wandiombola, ndine mwana’ke.\n" +
                   "\n" +
                   "Mphiko mwake, mphiko mwake, Adzandipatutsa ndani? Mphiko mwake ndidzakhalitsa, Modala nthawi zamthawi.\n" +
                   "\n" +
                   "⦁\tM’phiko mwale, pothawirapo pathu, Kukhumba kwa mtima kwapumula\n" +
                   "Dziko silitha kundichiritsatu, M’phiko mwakemo ndatonthozedwa.\n" +
                   "\n" +
                   "⦁\tM’phiko mwake, O ndipembezamo bwino, Ndikhalamo mpaka utha moyo,\n" +
                   "An’chinjiriza, sindipwetedwa, Ine mwa Yesu ndidzasungidwa"),
           new Hymns(63,"63. Ndisendeze Mbuye (Draw Me Nearer )","⦁\tAmbuye wanga, ndamva mawu anu, Achikondi chanuchi, Koma ndikhumba m’mikono yanu, Ndisendele pafupi.\n" +
                   "\n" +
                   "Ndisendeze Mbuye m’fupi ndi Mtanda, Pomwe munandifera, Ndisendeze Mbuye\n" +
                   "pambali yanu, Ndi mwazi wokhetsedwa.\n" +
                   "\n" +
                   "⦁\tMndipatutsire ku ntchito yanu; Ndi mphamvu ya chisomo; Chikwele xhiyembekezo changa; Kuthe kufuna kwanga\n" +
                   "\n" +
                   "⦁\tO chimwemwecho cha nthawi yomwe; Ndikhala pa Mpando wanu\n" +
                   "Ndikugwadira ndi kuyanjana; Ndi Mlungu bwenzi langa.\n" +
                   "\n" +
                   "⦁\tKuli chikondi sindingachithe, Mpaka ndifika tsidyalo, Kuli chimwemwe sindifitse; Mpaka ndiri m’Mwambamo.\n"),
           new Hymns(64,"64.Yesu Ndikukondeni (My Jesus I love Thee)","⦁\tYesu ndikukondeni, Ndinu wangatu, Ndataya mphulupulu kaamba ka inu;\n" +
                   "Mpulumutsi ndinutu, Mombolo wa chisomo, Motero ndikukondani Yesu tsopano.\n" +
                   "\n" +
                   "⦁\tNdikukondani poti Munandikonda, Pa Kalvari dipolo Munalipira,\n" +
                   "Mnamvera mingayo yankhaza pamphumipo, Motero ndikukondani Yesu tsopano.\n" +
                   "\n" +
                   "⦁\tM’moyo ndikukondani ndimo mu imfa, Ndi mpweya wanga wonse ndikuyamika, Ndidzakondwa pondigwera nkhungu ya imfayo, Potero ndikukondani Yesu tsopano.\n" +
                   "\n" +
                   "⦁\tM’mwamba mulemerero, m’nyumba zowala, Ndidzakutamandani nthawi za m’yaya.  Korona wanyezimira ndidzalandirako, Potero ndikukondani Yesu tsopano.\n"),
           new Hymns(65,"65.Bwenzi Ntakhala (O To Be Like Thee)","⦁\tBwenzi ntakhala wofan nanu, Mombolo wanga, ndikhumbatu,\n" +
                   "Ndataya chuma chonse chadziko, Ndivekedwe mkhalidwe wanu.\n" +
                   "\n" +
                   "Wofan nanu, wofana nanu, Mombolo wanga wakuyera, Maonekedwe okoma amu, Musindikize m’mtima mwanga.\n" +
                   "\n" +
                   "⦁\tBwenzi ntakhala wofana nanu, Wokoma mtima, wa chikondi, Wothandizatu akulefuka, Wobwezanso wolowerera.\n" +
                   "\n" +
                   "⦁\tBwenzi ntakhala wofana nanu, Wodzichepetsa ndi woyera; Wopiriratu thonzo lankhalwe, Wosaukira anthu ena.\n" +
                   "\n" +
                   "⦁\tWofana nanu, ndirikupempha, Tsanulirani Mzimu wanu, Kachisi wanu ndi mtima wanga; Musindikize Kumwambako.\n"),
           new Hymns(66,"66. Ndinu Chidzalo Chosatha (Closeto Thee)","⦁\tNdinu chidzalo chosatha, ndi Bwenzi loposatu, Pa ulendo wanga wonse, ndiyende mfupi ndi’nu.  Mfupitu ndi Inu, mfupitu ndi Inu,\n" +
                   "Pa ulendo wanga wonse, ndiyende mfupi ndi’nu.\n" +
                   "\n" +
                   "⦁\tSindipemphera zofewa, kaya kutcuka m’dziko, Mdizasauka mokondwa, koma ndiyende ndi’nu.  Mfupitu ndi Inu, mfupitu ndi Inu,\n" +
                   "Ndidzasauka mokondwa, koma ndiyende ndi’nu.\n" +
                   "\n" +
                   "⦁\tMtsogole m’Chigwa ndi Mthunzi, mndisunge m’namondweyu,\n" +
                   "Pachipata cha ku Moyo, ndilowe Mbuye ndi’nu.  Mfupitu ndi Inu, Mfupitu ndi Inu, Pa Chipata cha ku Moyo, ndilowe Mbuye ndi’inu.\n"),
           new Hymns(67,"67.Ndiri Ndi Nyimbo (In my Hearts)","⦁\tNdiri ndi nyimbo yomwe Yesu; Ananfitumizira, Nyimboyi njoposa nyimbo zina, Ndi nyimbo ya chikondi.\n" +
                   "\n" +
                   "M’mtima mwanga muli nyimboyi, E muli nyimboyi, ndi ya Kumwambadi,\n" +
                   "M’mtima mwanga muli nyimboyi, Ndiyo ya chikondi.\n" +
                   "\n" +
                   "⦁\tNdimakonda Khristu wofera; Machimo pa Kalvari, Analonga mtimanga nyimboyi, Ndi nyimbo ya chikondi.\n" +
                   "\n" +
                   "⦁\tNdidzayimba m’ulemerero, Pamodzi nfi angelo, Padzakhala nyimbo ya mavume, Yodzaza mabwalowo."),
           new Hymns(68,"68.Ndinamila M'Machimo(Love Lifted Me)","⦁\tNdinamira m’machimo, kutali ndi gombe, Ndinadetsedwa m’kati, wosayandamira, Koma Mbuye wa nyanja namva ndisisima, M’madzi anandikweza, nandiimitsa.\n" +
                   "\n" +
                   "Chikondicho chandikweza, Kunalibe china chothandiza, Chikondicho chandikweza, Kunalibe china, chikondicho.\n" +
                   "\n" +
                   "⦁\tNdampatsa mtima wanga, ndimkangamirabe, Ndidzakhalitsa naye, ndi kumthokozera, Chikondi choterecho chizitamandidwa, Ndi utumiki wokhulupirika.\n" +
                   "\n" +
                   "⦁\tWamngoziwe yangána, Yesu Mpulumutsi, Adzakutukulira m’mafunde ankhanza, Ndiye Mbuye wa nyanja, namondwe ammvera, Akhale Mpulumutsi wako lero.\n"),
           new Hymns(69,"69.Ndaima Pamaso Pake(How Marvelous)","⦁\tNdaima pamaso pake, pa Yesu Mnazarayo, Ndidabwa kuti akonda wodetsedwa wotero.\n" +
                   "\n" +
                   "Nchodabwitsa, nchozizwitsa, Ndiyimba nthawi zonse, Nchodabwitsa, nchozizwitsa, Ndi chikondi cha Ambuye.\n" +
                   "\n" +
                   "⦁\tMmunda nanditeteza, `Si kufna kwangai` Tchimo langa linagwetsa thukuta konga mwazi.\n" +
                   "\n" +
                   "⦁\tAngelowo a Kumwamba namchitira chifundo, Namlimbitsa mu chipsinjo, anandisenzerapo.\n" +
                   "\n" +
                   "⦁\tPamenepo o’mboledwafe, tiona nkhope yake, Tidzayimba nthawi zonse za chikondicho chake.\n"),
           new Hymns(70,"70.Mibvubi Ya Madalitso (Showers of Blessings)","⦁\tMibvumbi ya madalitso, ili ndi linjezano, Popeza nyengo ya mvula, yotumidwa ndi Mbuye.\n" +
                   "\n" +
                   "Mibvumbi ndiyo, ya madalitso idze, Madontho akugwa koma mibvumbiyo itsike.\n" +
                   "\n" +
                   "⦁\tMibvumbi ya madalitso yotitsitsimutsanso, Pa mapiri ndi madambo, pamvekedwe mvulayo.\n" +
                   "\n" +
                   "⦁\tMibvumbi ya madalitso, mutitumizireni, Mbuye tipatseni mdzutso, Mawu mukwaniritse.\n" +
                   "\n" +
                   "⦁\tMibvumbi a madalitso, bwenzi itatigwera, Kwa Mulungu tivomereza, kwa Yesu tiitana.\n" +
                   "\n" +
                   "⦁\tMibvumbi ya madalitso, ngati timvera Iye, Mvula itsanuridwa, monga kufuna kwake.\n" +
                   "\n"),
           new Hymns(71,"71.Wochulukanso (More Abundantly)","⦁\tMuli naye Yesu mnjira yonseyo?  M’mtima mwanu kodi Ali wa mtengo? Kodi mukumtsata?  Yesani Mawuwo.  Adzapatsa Mzimu mochulukanso.\n" +
                   "\n" +
                   "Wochulukanso, wochulukanso, `Akhale ndi moyo wochulukanso, Wochuukanso, wochulukanso, `Akahale ndi moyo wochulukanso.\n" +
                   "\n" +
                   "⦁\tTitama chisomo chosayeseka, Champulmutsiyo wotsika m’Mwamba, Timtamandiretu, Mawu odabwitsa, M’mwazi wake anatisindikiza.\n" +
                   "\n" +
                   "⦁\tBwerani kwa Iye, khulupirani, Mverani Mawu ake, dziperekeni, Akulandirani ngati mumuka, Adzapatsa mdalitso wochuruka"),
           new Hymns(72,"72.Mbuye Wondipulumutsa (Shall We Gather)","⦁\tMbuye wondipulumutsa, Mulandire mtima wanga, Mundipatse Mzimu wanu womeretsa zipatso’mo,\n" +
                   "\n" +
                   "Ndiye Mzimu wakuyera, Atipatsa ife makhalidwe, Ofanana naye Yesu, Anatsika kumwambako.\n" +
                   "\n" +
                   "⦁\tNawo Mzimu Mndiphunzitse kukondwera nsiku aonse, Ndi kukhala ndi mtendere,\n" +
                   "osaderatu nkhawa bi.\n" +
                   "\n" +
                   "⦁\tMndithandize kukondana ndi kuthangatira onse, Ndi kukhululukirabe\n" +
                   "akundichimwirawo.\n" +
                   "\n" +
                   "⦁\tMndilimbitse ndipirire osadandaula konse, Ndi kulamulira thupi ndi zofuna zakezo.\n" +
                   "\n" +
                   "⦁\tKudzilala ndi kufatsa, inde, zonse muzikonda, Mndiphunzitse pondipatsa, Mzimu wanu Woyerayo.\n"),
           new Hymns(73,"73.Tisonkhanetu Kumntsinje (Shall We Gather At the River)","⦁\tTisonkhanetu kumtsinje, komwe anayend’angelo; Madziwo onyezimira ayenda pampando wa Mlungu.\n" +
                   "\n" +
                   "Tisonkhanetu ku mtsinje, Ndi mtsinje wokongola ndi wamoyo, Tidzaona oyera ku mtsinje,\n" +
                   "Woyenda pa mpando wa Mlungu.\n" +
                   "\n" +
                   "⦁\tTikomanetu pamtsinje pomwe Mpulumutsi wathu, Adzachotsa nsoni zonse ndi ulemerero wa mpando.\n" +
                   "\n" +
                   "⦁\tTisanadze ku mtsinjewo tisitula akatundu, Chisomo chitilanditsa, chitivekatu korona.\n" +
                   "\n" +
                   "⦁\tPosachedwa pamtsinjewo ulendo wathu udzatha, Posachedwa tokondwera, tiyimbe za mtenderewo.\n"),
           new Hymns(74,"74. Ngati Kumasulidwa (Look to the Lamb of God)","⦁\tNgati ufuna kumasulidwa, Ona Mwana’nkhosa; Pa Kalvari anakuombola, Ona Mwana’nkhosa\n" +
                   "\n" +
                   "Ona Mwana’nkhosa, Ona Mwana’nkhosa, Yekhayo angakupulumutse, Ona Mwana’nkhosa.\n" +
                   "\n" +
                   "⦁\tUkayesedwa ndi zokayika, ona Mwana’nkhosa, Mu mphamvu yake udzagonjetsa, Ona mwana’nkhosa.\n" +
                   "\n" +
                   "⦁\tKodi walema m’njira yovuta? Ona Mwana’nkhosa, M’chikondi chake udzapumula, Ona Mwana’nkhosa.\n" +
                   "\n" +
                   "⦁\tUsaopatu nthunzi panjira, Ona Mwana’nkhosa, Mu chimwemwe pena muchisoni, Ona Mwana’nkhosa.\n"),
           new Hymns(75,"75.Mundinyemere Mkate (Break Thou the Bread)","⦁\tMundinyemere’ne mkate wamoyo, Monga kunyanja kuja kalelo, Ndipyola mawwo, ndifuna Inu, Ndikhuma Inu mwini moyowo.\n" +
                   "\n" +
                   "⦁\tMkate wamoyo ndinu Ambuye, Mawu oyera any n’khumbanso; Mun’dyetse omwewo, ndikhale moyo, Ndikonde zakuona zanzo.\n" +
                   "\n" +
                   "⦁\tMtume tsopanoli Mzimu Woyera, Kuti andikonzere M’masomo, Abvumbulutse zinsinsi za m’Mawu, Kuti ndionemo Ambuyeyo.\n" +
                   "\n" +
                   "⦁\tMndidalitsire’ne Mawu amoyo, Monga munadalitsa mkatewo, Ndikhale mfuludi, wosamangika, Mukhale moyo wanga wonsewo.\n" +
                   "\n"),
           new Hymns(76,"76.Pa Nyanjayi Ya Moyo (I've Achored In Jesus)","⦁\tPa nyanjayi ya moyo, Namondwe ali pi! Nangula wanga alai chiyembekezochi,\n" +
                   "Mayeso akabwera, mphepo zikaopsa, Mwa Yesu ndipumulatu koposa.\n" +
                   "\n" +
                   "Nangula ndi Yesus, m’namondwe ndiri nji, Nangula ndi Yesu, mkati mwa mphepozi\n" +
                   "Nangula ndi Yesu, ndiye Mpulumutsi,Ndaphimbidwa ndi Thanthwe Lakale.\n" +
                   "\n" +
                   "⦁\tAsunga moyo wanga ndi mtendere wake, Madzi  achita bata ndi liulo lake,\n" +
                   "Woongolera bwato, ndi wondilanditsa, Ndi Yesu yemwe amandikwanitsa.\n" +
                   "\n" +
                   "⦁\tBwenzi ndi Mpulumutsi, ndi Nangula wanga, Amanditchinjiriza naingitsa mantha,\n" +
                   "Ndiyang’ana Kumwamba kuseri kwa nyanja, Alikundikonzera malo anga.\n" +
                   "\n"),
           new Hymns(77,"77. Ndikhumba Mtima (O For a Heart )","⦁\tNdikhumba mtima woyeratu mbu, Ndi wosungidwa ndi moyo wanu,\n" +
                   "Kudzikweza ndizilakolakozi, Zithe mu Chitsime cha Kalvari.\n" +
                   "\n" +
                   "Mtima wanga uyere mbu, Mpulumutsi wanga ndidza kwa Inu, Munafera pondikonda ndithu,\n" +
                   "Ndipatseni mtima woyera mbu.\n" +
                   "\n" +
                   "⦁\tNdikhumba mtima woyeratu mbu, Ndi wodekha mu mtendere wanu, Wotsiridwa ndi mvula ya mwamba, Ndi wokonzeka kutumikira.\n" +
                   "\n" +
                   "⦁\tNdikhumba mtima woyeratu mbu, Woyaka moto wa Mzimu wanu, Wodzazidwa ndi chikondi chanu, Chikondi  choingitsa manthawo\n" +
                   "\n" +
                   "⦁\tNdikhumba mtima woyeratu mbu, Wodzazidwa chisomo ndi nzeru, Wofanana ndi chitsanzi chanu, Kufikira nditam’ona Yesu.\n"),
           new Hymns(78,"78.Mfumu Yanga Koronayu (Lead Me to Calvary)","⦁\tMfumu yanga, koronayu ndikuvekeni, Ndingaiwale mingayo, ndindze pa Kalvari.\n" +
                   "\n" +
                   "Ndikumbuke Getsemane, ndikumbuke nsoni zanu, Ndikumbuke chikondicho, ndidze pa Kalvari.\n" +
                   "\n" +
                   "⦁\tNdionetseni mandawo anakuikani, Komwe angelo owala anakulondani.\n" +
                   "\n" +
                   "⦁\tMonga Mariya ndibwera ndi mphatso yangayi, Ndione Mwauka m’manda, nddze pa Kalvari.\n" +
                   "\n" +
                   "⦁\tNdikusenzereni Mtanda, Mbuye tsiku ndi tsiku, Ndimwere nanu chikhocho, Mnandimwera konko.\n" +
                   "\n"),
           new Hymns(79,"79.Pakupempha Ife Pano (Why Not Now)","⦁\tPakupempha ife pano, pakuitana ‘Tatewo, Pakudziwa tsoka lako bweratu kwa Mbuyeyo.\n" +
                   "\n" +
                   "Idzatu, idzatu, kwa Mbuyathu Yesudi, Idzatu, idzatu, iwe bwera leroli.\n" +
                   "\n" +
                   "⦁\tUnachimwachimwa ndithu, wosochera mtalimo, Unachedweranji kudza, pakulinda Yesuyo?\n" +
                   "\n" +
                   "⦁\tM’dziko lino pansi pano, sukapeza kanthumo, Kokwanitsa mtima wako, bweratu kwa Mbuyeyo.\n" +
                   "\n" +
                   "⦁\tVumbulutsa zonze zako zobisika m’mtimamo, Ayeretse moyo wako nawo Mwazi wakewo.\n"),
           new Hymns(80,"80.Dzuwa Liwala ( Heavenely Sunlight)","⦁\tDzuwa liwala m’ulendo wanga, Monse m’mapiri ndi m’zidikha, Yesu anati, ‘Sindikusiya,’ Lonjezo lake ndi losatha.\n" +
                   "\n" +
                   "Dzuwa liwala, dzuwa la Mwamba, Liunikira mtima wanga, Haleluya, ndisekerera,\n" +
                   "Ndimtama Yesu, ali wanga.\n" +
                   "\n" +
                   "⦁\tMithunziyondizinga ponsepo, Si’ngabisire Mpulumutsi, Ndiyetu Nyali, alibe mdima,\n" +
                   "Ndiyenda naye pafupi.\n" +
                   "\n" +
                   "⦁\tM’kuwala kwake ndikumyamika, Ndikalamira za kumwamba, Ndikumyimbira mmene ndiyenda, Mu chikondicho chakuwala.\n"),
           new Hymns(81,"81.Ukapenya Kwa Yesu(Look,Look)","⦁\tUkapenya kwa Yesu uliko moyoko, Inde, moyo tsopanopanotu; Wolakwira upenye kwa Yesu Mbuyeyo, Pa Mombolo naferatuwe.\n" +
                   "\n" +
                   "Ona! Ona! Onatu! Kili moyo kwa yense apenya Yesuyo, Wakuferatu pamtamdapo.\n" +
                   "\n" +
                   "⦁\tAnasenzapa bwanji uchimo wonsewo, Ngati wako kwa Yesu sulipo? Bwanji mwazi wakhetsa kutsuka ifetu, Ngati uwu sitikwanako?\n" +
                   "\n" +
                   "⦁\tZilepheradi zonse kogula moyowo, Koma Mwazi wa Yesu Mbuyeyo, Khulupira mwa mphamvu za Mlungu wathuzi, Kuyeretsa’we m’mtima’komo.\n" +
                   "\n" +
                   "⦁\tAnathera pa Mtanda zintchito zonsezi, Zoombola mizimu yathuyo, Ndipo yense akadze mokondwakondwadi, Moyo apeza kwa Yesuko.\n"),
           new Hymns(82,"82.Lero Ndikondwera (Whosoever Meaneth Me)","⦁\tLero ndikondwera, dzuwa liwala, Mitambo yachotsedwa; Poti Ambuye anandimema,\n" +
                   "Kuti, ‘Akiyense.’\n" +
                   "\n" +
                   "Aliyense, nkunena ine, Nkunena ine, O nkunena ine, Aliyense, nkunena ine, Aliyense ndi ine.\n" +
                   "\n" +
                   "⦁\tChakwezeka chiyembekezo changa, Mtimanga wadzazidwa, Ndamasulidwa m’machimo anga, Mwazi wandichiza.\n" +
                   "\n" +
                   "⦁\tNchodabwitsa chikondi ndi chisomo, Yesu anandifera, Ndinatayika mnjira ya dziko,\n" +
                   "Lero ndamasuka.\n"),
           new Hymns(83,"83.Sing'anga Mkulu (Great Physician)","⦁\tSing’anga ‘mkulu ndiye Yesu, Mwana wa Mulungu, Asangalatsa achisoni, Ali wachifundo.\n" +
                   "\n" +
                   "Dzina la Yesus ndi lokoma, Dzina la Yesu lipambana, Dzina lake lakukonda, Yesu inde Yesu.\n" +
                   "\n" +
                   "⦁\tZoipa zakhululukidwa, Yesu amatero; Tiyende bwino m’njira yake, tolowemo lero.\n" +
                   "\n" +
                   "⦁\tNditama nsembe ya Mulungu, ndilandira Yesu, Ndikonda dzinalo labwino, dzina lanu, Yesu.\n" +
                   "\n" +
                   "⦁\tAkulu inu m’bwere nonse, anainu nomwe, Ambuye akuitanani, vomerani nonse.\n"),
           new Hymns(84,"84.Nkondo Yatha (The Battle is Over)","⦁\tNkhondoyo yatha, imfa yagonja, Yesu wamoyo anaiposa, Msampha woipa wonse naonja, Aleluya!\n" +
                   "\n" +
                   "⦁\tMphamvu za imfa ndi ZA Satana; Naye Ambuye zinalimbana,\n" +
                   "Komatu Yesu anapambana; Aleluya!\n" +
                   "\n" +
                   "⦁\tAtha masiku aja ansoni, Mbuye wauka, ali ndi mboni,\n" +
                   "Lero chimwemwe, chatha chisoni, Aleluya!\n" +
                   "\n" +
                   "⦁\tNsinga za imfa Iye nadula, Khomo la m’Mwamba nalitsegula,\n" +
                   "Yesu timtama, tonse tifuula, Aleluya!\n" +
                   "\n" +
                   "⦁\tMbuye, mabala anu olimba, Atichotsera mantha a imfa,\n" +
                   "Tsono ndi mtima wonse tiyimba, Aleluya"),
           new Hymns(85,"85.Wandikhululukila (It is Truly Wonderful)","⦁\tWandikhululukira, Wandiyeretsanso, Zonse ndavomereza, ndachira m’Mwaziwo.\n" +
                   "\n" +
                   "Ziri zodabwitsatu ntchito za Mbuye, Ziri zodabwitsatu, ziri zodabwitsatu,\n" +
                   "Ziri zodabwitsatu ntchito za Mbuye, Mtama dzinalo.\n" +
                   "\n" +
                   "⦁\tAmandisunga lero mwa chisomo chake, Poti ndaomboledwa, ndidzam’ona Iye.\n" +
                   "\n" +
                   "⦁\tAndipyoza mnsautso, sindikhala ndekha, Ali pafupi ndine, mmene ndayesedwa.\n" +
                   "\n" +
                   "⦁\tAmandichinjiriza, nathira madalo, Usefukira mtima ndi ulemerero.\n" +
                   "\n"),
           new Hymns(86,"86.Inu Ninse Ovutidwa","⦁\tInu nonse ovutidwa, Mbuye ali panopa; M’maso mwanu muli misozi, ‘dzani kwa mbuyathuyo.\n" +
                   "\n" +
                   "Yesu ngwa chifundochi; E! Wafera inutu, E! Wafera inutu.\n" +
                   "\n" +
                   "⦁\tYesu ndiye bwenzi lanu, ali wachifundocho, Kodi inu mumkanabe? Mlape msanga m’mtimamo.\n" +
                   "\n" +
                   "⦁\tPena imfa idza mawa, manda ali m’fupimo; Nthawi ino ndiyabwino, mlole Yesu m’mtimamo.\n" +
                   "\n" +
                   "⦁\tNdi angelo akumwamba anke ndi uthengawo; Kuti wina wadza lero kwa Mbuyathu Yesuyo.\n"),
           new Hymns(87,"87.Wochimwa Iwe Bweratu (Only Trust Him )","⦁\tWochimwa iwe bweratu kwa Yesu mbuyeyo, Atero Iye, pumatu, umvere mawuwo.\n" +
                   "\n" +
                   "Khulupira mawu onse a Mbuyathuyo, Uli nawo pakumvera, inde moyowo.\n" +
                   "\n" +
                   "⦁\tAmbuye Yesu anatsira mwazi wake pyu, Ubire m’Mwazi womwewo, uyereyere mbu.\n" +
                   "\n" +
                   "⦁\tWamoyo ndiye Yesudi, nzoona zakezo, Akhala Iye njiratu yofika m’Mwambamo.\n" +
                   "\n" +
                   "⦁\tTiyeni tonse, tinkeko ulendo wakewo, Ku dziko lake m’Mwambamo, tikhale nayeko.\n" +
                   "\n"),
           new Hymns(88,"88. Kale Lija Mwaziwo (The Blood Has Never Lost)","⦁\tKale lija mwaziwo unali wamphamvutu, Mbalayo kumpulumutsadi,\n" +
                   "Mzimu wake tsikulo unali m’Paradaiso, M’mphamvu ya Mwazi wa Kalvari.\n" +
                   "Mwaziwo sudzasowa mphamvu, E konse! E konse! Mwaziwo wochotsera machimo, Sudzasowa mphamvutu.\n" +
                   "\n" +
                   "⦁\tNdinamira m’zoipa, koma Mwazi wotsuka, Ndithu unandimasulira,\n" +
                   "Momwe unali kale, nditama dzina lake, Mtsinjewo uli wotsukira.\n" +
                   "\n" +
                   "⦁\tWochimwa akufunsa, bwanji ufuna kufa? Poti watiomboratu,\n" +
                   "Ukatukula maso udzalandira moyo, Mtanda uli nayobe mphamvu.\n" +
                   "\n" +
                   "⦁\tBwera ndi zothodwetsa, fulatira zoipa, Angathe kukupulumutsa,\n" +
                   "Thawa mkwiyo wakewo, ulembetse dzinalo, M’Buku la akusambitsidwa.\n" +
                   "\n"),
           new Hymns(89,"89.Lero Lino (AFrican Tune)","⦁\tLero lino, mbale wanga, ndilo dzuwa lakukoma, Talandira Mpulumutsi, mmene alikuitana.\n" +
                   "\n" +
                   "⦁\tLero lino, mbale wanga usazengeleze ayi, Ngati ulandira Yesu, lero udzachita mwai.\n" +
                   "\n" +
                   "⦁\tLero lino ndilabwino, moyo wako uli nawo, Pena m’mawa, umwalira, udzatani mlandu wako?\n" +
                   "\n" +
                   "⦁\tLero lino, mbale wanga, lapa mtima, lapa tchimo, Yesu adzakulandira, ikampempha lero lino.\n" +
                   "\n" +
                   "⦁\tNdiwe mlendo, lero lino, mvera ndikupempha ine, Yesu, mwana wa Mulungu, akufuna ndith iwe.\n"),
           new Hymns(90,"90.Pamtanda Mbuye Anafera (Glory to His Name)","⦁\tPa mtanda Mbuye anafera, Ndinadzapo ndi tchimo langa\n" +
                   "Pomwe mtimanga watsukidwa, Ulemerero.\n" +
                   "\n" +
                   "Ulemerero kwa dzina lake, Pomwe mtimanga watsukidwa, Ulemerero.\n" +
                   "\n" +
                   "⦁\tNdapulumuka modabwitsa, Yesu analowa mumtima, Pa Mtanda anandilandira, Ulemerero\n" +
                   "\n" +
                   "⦁\tO Chitsime chotsuka tchimo, Ndikondwa kuti ndalowanso, Momwe amandiyeretsanso, Ulemerero\n" +
                   "\n" +
                   "⦁\tBwera ku Chitsime chokoma, Dzigwetsere pa phazi lake, Lumphamo lero utsukidwe, M’ulemerero.\n"),
           new Hymns(91,"91.Ndinali Wochimwa (New Name Written)","⦁\tNdinali wochimwa, komatu, Ndinabwerera kwa Ambuye, Anandilandira mwa ufulu, Nandikhulukira.\n" +
                   "\n" +
                   "Dzina lina lalembedwa Kumwamba, Ndi langa, ndi langalo, Angelo alikuyimba kuti, ‘Wochimwa wabwera,’(Ndithudi) dzina lalembedwa kumwamba, Ndi langa, ndilangalo, Ndakhululukidwa, ndipita Kumwamba,\n" +
                   "Osayendanso\n" +
                   "\n" +
                   "⦁\tNdinalikugwada pamtanda, Ndinaopa mkwiyo wa Mlungu\n" +
                   "Kona’naonetsa m’Mwambamo, Dzian langa m’Bukhumo.\n" +
                   "\n" +
                   "⦁\tM’Buku mwalembedwaa, ‘Chisomo, Chakupulumutsa iweyo.’\n" +
                   "O, chimwemwe ndithu, ndi Mwazi, Ndakhululukidwatu"),
           new Hymns(92,"92. Mbuye Ndi Nthanthwe Lolimba (A shelter in Time of Storm )","Mbuye ndi thanthwe lolimba, ndipousira chimphepo,M’zovuta takhazikika, ndi pousira chimphepo.\n" +
                   "\n" +
                   "Yesu ndi thanthwe m’dziko lotopesa, Lotopetsa, lotopetsa, Yesu ndi thanthwe m’dziko lotopetsa,Ndipousira chimphepo.\n" +
                   "\n" +
                   "Ndiye mthunzi pausana, ndipousira chimphepo, M’usiku soaps mantha, ndipousira chimphepo.\n" +
                   "\n" +
                   "Namondwe akatizinga, ndi posuira chimphepo, Panopa sitisunthidwa, ndi pousira chimphepo.\n" +
                   "\n" +
                   "Thanthwe langa losira, ndi pousira chimphepo, Ndinu wotithangatira, ndi pousira chimphepo.\n"),
           new Hymns(93,"93. Moyo, Moyo (He Lives)","Nditumikira Mbuye amane wauka, Palibe chikaika, ali wamoyotu,\n" +
                   "Ali nacho chifundo, amanditonthoza, Pamene ndimsowadi,ali\n" +
                   "pompo.\n" +
                   "\n" +
                   "Moyo, moyo, Yesu ngwamoyo lero, Ayenda nane, nakamba nane,\n" +
                   "M’njira yopapatiza; Moyo, moyo kutipulumutsa,Ali moyo mumtimanga,\n" +
                   "Inde ali moyo.\n" +
                   "\n" +
                   "Ponse padziko lino pali mboni zake, Mtima ukalefuka sindidzalefuka;\n" +
                   "Amanditsogolera muzovuta zonse, Tsiku lobwera Mbuye lidza msanga.\n" +
                   "\n" +
                   "Kondwerani Akhristu, kwezani mawu anu, Yimbani haleluya kwa Yesu Mfumuyo.  Chiyembekezo chathu, mthandizi wa onse, Palibe wotikonda monga Iye.\n" +
                   "\n"),
           new Hymns(94,"94.Kodi Mwalandira Yesu ? (Room for Jesus)","Kodi mwalandira Yesu?  Iye anakuferani, Afunitsa inu nonse, Inu mumufunako?\n" +
                   "\n" +
                   "Kodi mufunatu Yesu? Vomerani msangatu, Inde Yesu ndifunadi, Ndinu Mbuye wangatu.\n" +
                   "\n" +
                   "Nthawi zonse mufunabezinthuzo za pansi pano.  Koma munyozabe Yesu, Wopachikidwa kale.\n" +
                   "\n" +
                   "Yesu akuitanani, Kwanja kwake kwakukulu, Mvani mawu ake lero, musachite nthantha bi.\n" +
                   "\n" +
                   "Imfa idzafika msanga, ndipo mudzaikwa m’manda, Nthawi yomwe simudzamva kuitana kwakeko"),
           new Hymns(95,"95.Tiyimbe Nyimbo (African Tune)","Tiyimbe nyimbo zotamanda, Mulungu wathu wabwino, Pakuti akondana nawo anthu okhala pa dziko; Tero natuma Mwana wake wakukondedwa kalelo, Kutiphunzitsa ife tonse za chikondano chakecho.\n" +
                   "\n" +
                   "Mulungu ndiye wachifundo, nadzalandira onsewo, Akuulula mphulupulu, ndi kukondana ndi Yesu, Tilondelonde njira yake yopapatiza, yayingóno, Adzatilondolera ndiye, kutifikitsa m’Mwambamo.\n" +
                   "\n" +
                   "Pakuoloka mtsinje wa imfa, dzanja Mbuyathu agwira, Tikadagwira ntchito zake, atipatsatu korona; Komwe kulibe masauko, pena misozi, maliro, Mulungu tidzamtamandira, inde, kosalekezanso.\n"),
           new Hymns(96,"96.Nkokoma Kukhulupira (Tis so sweet)","Nkokoma kukhulupira, ndi kumvera Mawu ake, Kungopuma pa Lonjezo, kungomva, ‘ Ati Mbuye.’\n" +
                   "\n" +
                   "Yesu ndimkhulupirira, Ndatsimikizikatu, Yesu, Yesu Wokondwayo, Ndimkhulupirirebe.\n" +
                   "\n" +
                   "Nkokoma kukhulupira Mwazi wakutsikira, Kungomila mumtsinjewo wochiritsa mitima.\n" +
                   "\n" +
                   "Nkokoma kukhulupira, kungoleka kuchimwa, Kungolandira kwa Yesu moyo, mvano, mtendere.\n" +
                   "\n" +
                   "Ndakondwa ndikhulupira Yesu Mpulumutsiyo, Ndidziwa ali ndi ine kunthawi za nthawinso.\n"),
           new Hymns(97,"97. Mu Ukapolo","Mu ukapolo wa ndimawu, Yesu ndidza, Yesu ndidza; Ku ufulu wa kuunika, Yesu ndidza kwa Inu. Nthenda zanga muzichiritse, zosowazi muzikwanitse;\n" +
                   "Tchimo langa mukhulu’kire, Yesu ndidza kwa Inu.\n" +
                   "\n" +
                   "Wolephera ndi wamanyazi, Yesu ndidza, Yesu ndidza; Nditamandira mtanda wanu, Yesu ndidza kwa Inu.  Zisoni zangazi zichire, mphepo zamoyo zikhale phe; Kulira kwanga mutonthoze, Yesu ndidza kwa inu.\n" +
                   "\n" +
                   "Ine ndinali wodzikuza, Yesu ndidza, Yesu ndidza; Kufuna kwanu kuchitike, Yesu ndidza kwanu Inu, Kudzikonda kwanga kuthedwe mwa chikondi changwiro chanu, Nsoni isanduke chimwemwe, Yesu ndidza kwa Inu.\n" +
                   "\n" +
                   "Ndinkaopa imfa ndi manda, Yesu ndidza, Yesu ndidza; Tsono nditi Kumwamba nkwathu, Yesu ndidza kwa Inu, Chionongeko chisanduke mtendere wanu wa kumwamba, Ndikhalitse pamaso panu, Yesu ndidza kwa Inu.\n"),
           new Hymns(98,"98.Ntchito Yanga Ikatha (I shall Know Him)","Ntchito yanga ikatha, ndikaoloka mtsinjewo, Ndikaona tsikulo likatha,\n" +
                   "Ndidzamdziwa Mombolo wanga patsidya ilo, Adzandirandirako mosekera.\n" +
                   "\n" +
                   "Ndidzamdziwa, ndidzamdziwa, Powomboledwa ndidzaimapo, Ndidzamdziwa, ndidzamdziwa, Ndi zipsera za m’manja mwakemo.\n" +
                   "\n" +
                   "O Chimwemwe chamoyo poona nkhope yake, Ndi maso ake okoma owala,\n" +
                   "Mtima wanga udzathokozera chisomocho, Chondikonzera chinyumba kumwamba.\n" +
                   "\n" +
                   "Okondedwa m’ulemerero andikodola, Omwe ndalekana nawo pa mtsinje,\n" +
                   "Ndikafika m’Edene wa m’Mwamba adzayimba, Koma ndiyambe ndamuona Ambuye.\n" +
                   "\n" +
                   "Polowa mu mzindawo ndi nsalu yoyera mbu, Adzapukutira misonzi yonse,\n" +
                   "Tidzayimba pamodzi nyimboyo ya chimwemwe, Koma ndiyambe ndamuona Ambuye.\n"),
           new Hymns(99,"99.Mwamva Mawu A Mulungu(You Have Herad the Word of God)","Mwamva mawu a Mulungu, muvomereza bwanjiko? Kodi musinthika mtima, ndi kumvera Yesuyo?\n" +
                   "\n" +
                   "Vomerani, vomerani, vomerani, msangatu, Musazengeleze ayi, Landilani Yesuyo.\n" +
                   "\n" +
                   "Musachita nthantha kale, musazengelezabe; Yesu akulindirani, sadzakana inu ayi.\n" +
                   "\n" +
                   "Musaope pokumbuka zokuipa zanuzo; Khulupirirani Yesu, adzachotsa zonsezo.\n" +
                   "\n" +
                   "Perekani mtima wanu kwa Mulungu wathuyo; Khulupirirani Yesu, Wotifera kalelo.\n" +
                   "\n"),
           new Hymns(100,"100. Sindingazindikire Chifukwa(I know Whom)","Sindingazindire chifukwa chisomo chinandidzera, Ndine wosayenera komatu Khristu anandiombola.\n" +
                   "\n" +
                   "Koma Yesu ndimzindikira, Ndimo ndidziwa ali wamphamvu, Yosunga chomwe ndampatsa, kufikira tsikulo.\n" +
                   "\n" +
                   "Sindingazindikire njirayo yakundipulumutsira; Kungokhulupira Mawu ake kunanditenga mtendere.\n" +
                   "\n" +
                   "Sindingazindikire ngatitu ndidzangoona zabwino, Kapena zolemetsa panjira, ndisanam’ona Ambuye.\n" +
                   "\n" +
                   "Sindingazindikire tsikulo Ambuye wanga abwera, Kaya ndiyenda m’chigwa cha imfa, kapena ndikwatulidwa.\n"),
           new Hymns(101,"101.Mbusa Wanga (Bring Them In)","A, Mbusa wanga, ndimvatu ulo ku chipululuko, Zilira nkhosa zaketu, ziri kutali n’kholalo.\n" +
                   "\n" +
                   "Bwezatu, bwezatu, bweza zonse m’opsamoo; Bwezatu, bwezatu, bweza zakezo kwa Yesu.\n" +
                   "\n" +
                   "Ndani ufuna kunkako kukazipeza nkhosazo? Ndani adzathandizako, kuti zifunde m’kholamo?\n" +
                   "\n" +
                   "Mtali mutali m’phirimo, Mvetsa, zilira nkhosazo; A, Mbusa wako atitu, ‘Bweza zothedwa m’kholamo,’\n" +
                   "\n" +
                   "Etu! Zilira konseko, ziri m’phiri moopsamo, Imva, anena Mwiniyo, ‘Kwaye upeze nkhosazo.\n"),
           new Hymns(102,"102. Thanthwe Long'ambikatu (Rock of Ages)","Thanthwe long’ambikatu, ndibisale momwemu! Madzi ndipo mwaziwo zuturuka  m’nthitimo, Zinditsuke m’mtima mbu, Zindilimbikitsetu.\n" +
                   "\n" +
                   "Ntchito zanga zonsezo sizikondweretsa ‘Nu, Ndikazigwiritsadi, ndikhalira nsonizi, Zonse sizikwanazi, koma Yesu yekhayo.\n" +
                   "\n" +
                   "M’manja mwanga chabe bi, mtanda ndingogwiradi; ‘Maliseche mveke ‘ne, ndiri ndekha nsunge ‘ne, Ndithawire mtsinjewo, mundisunge m’mtimamo.\n" +
                   "\n" +
                   "M’moyo uno kunsiku, pena ndimwaliratu, Ndi kufika kwanuko, tionane masowo; Thanthwe long’ambikatu, ndibisale momwemo"),
           new Hymns(103,"103.Wina Atikonda (Someone Loves Us)","Wina atikonda ife, Bwenzi lathu ndiyeyu, Atifunafuna ife, inde nthawi zonsetu,\n" +
                   "\n" +
                   "Chikondano chakechi, nchachikulu - kuludi  Chikondano chakechi, nchachikulu – kuludi\n" +
                   "\n" +
                   "Ndani mwa abale athu akanatiferafe? Koma Yesu m’malo mwathu anapachikidwatu.\n" +
                   "\n" +
                   "Anamnyoza pansi pano, bwenzi la ochimwawo, Mu ulemerero wake alikonda dzinali.\n" +
                   "\n" +
                   "Timchimwira kopambana, ndi kumusautsa’ye, Koma Bwenzi lathu Yesu atikonda – kondatu.\n" +
                   "\n" +
                   "Mtiphunzitse Mbuye Yesu, tikondane nanutu, Tisaiwalire konse Bwenzi lathu ndinutu.\n"),
           new Hymns(104,"104.Pokumbukila Mtandawo (When I survey)","Pokumbukira Mtandawo Ambuye nandiferapo, Ndiyesa zingochepazo, ndinazitama kalelo.\n" +
                   "\n" +
                   "Mndiletse, ndingatame zachabe, koma imfayi; Zijazo ndinakondazo ndazilekera mwaziwo.\n" +
                   "\n" +
                   "Onani m’mutu, m’manjanso, mudzera nsoni m’mwazimo, A! panalibe kalero wondivalira mingayo.\n" +
                   "\n" +
                   "Chinkana dziko lonselo lichepa ndithu mtulowo, Chikondicho chagwirabe mtimanga, moyo, ndense’ne.\n"),
           new Hymns(105,"105. Ndingokhulupirira (Trusting Jesus)","Ndingokhulupirira, nkana njira njovuta, Mwa zondikayikitsa, Yesu ndimkhulupira.\n" +
                   "\n" +
                   "Ndingokhulupirira, m’mene nthawi ipita, Mu zonse zondigwera, Yesu ndimkhulupirira.\n" +
                   "\n" +
                   "Mzimu umamwalira m’kati mwa mtima wanga, Mwa Iye sindingagwe, Yesu ndimkhulupira.\n" +
                   "\n" +
                   "Usana ndimayimba, kukada ndipemphera, M’ngoni ndim’itanira, Yesu ndimkhulupira.\n" +
                   "\n" +
                   "M’zaka zonse za moyo, mpaka dziko lidzatha, Ndikalowa m ‘Mwambamo, Yesu ndimkhulupira.\n"),
           new Hymns(106,"106.Pa Mafunde A Moyo (Count Your Blessings)","Pa mafunde a moyo ndi namondwe, Mukuyesa zonse zatayikatu,\n" +
                   "Werengani madalo ali onse, Mudzadabwa nazo ntchito za ‘Mbuye.\n" +
                   "\n" +
                   "Werengani madalo anu, Werengani ntchito za Mlungu, Werengani lili lonselo,\n" +
                   "Werengani madalo a Mulungu.\n" +
                   "\n" +
                   "Kodi mumathodwa ndi katunduyo? Mtanda mukusenza ndi wolemera?\n" +
                   "Werengani madalo onse anu, Ndipo mudzayimba tsiku ndi tsiku.\n" +
                   "\n" +
                   "Ngakhale anzanu akalemera, Yesu watilonjeza chuma china,\n" +
                   "Werengani madalo ndalamazo; Sizigula mphoto yanu Kumwamba.\n" +
                   "\n" +
                   "Mkati mwa nsautso zazikuluzo, Musataye mtima, Mlungu aona,\n" +
                   "Werengani madalo, angelowo, Adzachinjiriza mpaka mapeto.\n" +
                   "\n"),
           new Hymns(107,"107.Poyenda Ndi Mbuye (Trust & Obey)","Poyenda ndi Mbuye m’kuwala kwa Mawuwo, Panjira pamaunikira;\n" +
                   "Tikafuna zake amakhala nafe, Pomvera ndi kukhulupira.\n" +
                   "\n" +
                   "Khulupira, kulibenso njira, Yakukondwa mwa Yesu, kungokhlulupira.\n" +
                   "\n" +
                   "Mthunzi wotigwera, mitambo yodetsa, Zithawa ngati angoseka\n" +
                   "Kulibenso mantha, pena kusisima, Pomvera ndi kukhulupira.\n" +
                   "\n" +
                   "Zothodwetsa zathu, nsoni ndi zintchito, Adzatilipira mokewana,\n" +
                   "Tikasenza mtanda, adzatidalitsa, Pomvera ndi kukhulupira.\n" +
                   "\n" +
                   "Sitingaziyese za chikondi chake, Mpaka zonse tazipereka; Chisomo chakecho amapatsa iwo, Omvera ndi kukhulupira.\n" +
                   "\n" +
                   "Tsono tiyanjana pa mapazi ake, Timayenda naye pa njira, Zomwe alankhula, komwe atituma, Timvere ndi kukhulupira.\n" +
                   "\n" +
                   "\n"),
           new Hymns(108,"109.Mtidzutse Mbuyetu (Rivie Thy Work)","Mtidzutse, Mbuyetu, Mtionekeremu, Munene zakumvekazi, Timvere ifetu.\n" +
                   "\n" +
                   "Mtidzutse, Mbuyetu, Mtipatse moyonso; Mudzetu, Mbuye, mudzetu tidalitsenitu.\n" +
                   "\n" +
                   "Mtidzutse, Mbuyetu, tikweze dzinali, Tiuziretu mpweyawo m’mitima yathuyi.\n" +
                   "\n" +
                   "Mtidzutse, Mbuyetu, timvere mawudi, Zoona zanu tonsefe, tikhulupirezi.\n" +
                   "\n" +
                   "Mtidzutse, Mbuyetu, Mthirenso Moyowo, Ulemu ngwanu nokha’Nu, dalitso nlathulo.\n"),
           new Hymns(109,"109.Nditikudza Kwa Ambuye (I amComing To Jesus)","Ndirikudza kwa Ambuye, ndisauka ndinachimwa; Zonse zanga ndizisiya kudzapeza moyo wina.\n" +
                   "\n" +
                   "Yesu ndikhulpirira, munafera ine ndemwe, Mwa umphawi ndipemphera, mundipulumutse tere.\n" +
                   "\n" +
                   "Kale ndinalira Inu, kale lomwe ndangochimwa, Mund’itana ‘Idza bwino kuti n’kuchotsere tchimo.’\n" +
                   "\n" +
                   " Yesu n’kupatsani zonse, ziri zanu zokha zokha, Thupi lonse, mtima omwe,\n" +
                   "mwini wake ndinu nokha.\n" +
                   "\n" +
                   "E, ndikukhulupirirani, ndauona mwazi wanu, Tere ndikugwadirani, tere\n" +
                   "ndapachikwa nanu.\n" +
                   "\n" +
                   "Wadza Yesu wandidzoza, ndakonzeka mwa Iyeyu; Ndine wake, tikondana, ndiyamika Mbuye Yesu.\n"),
           new Hymns(110,"110.M'manda Anagona (ChristArose)","M’manda anagona, Yesu Mombolo, Nalinda tsikulo, Yesu Mbuye.\n" +
                   "\n" +
                   "Wauka m’mandamo, napamban’adani onsewo.  Wauka Mgonjetsi m’malo a mdima,\n" +
                   "Kudzatsogolera oyera mtima, Wauka, wauka, haleya wauka.\n" +
                   "\n" +
                   "Mlonda sangaletse Yesu Mombolo, Mwala sungasunge Yesu Mbuye.\n" +
                   "\n" +
                   "Imfa inagonja; Yesu Mombolo, Wathyola unyolo, Yesu Mbuye.\n"),
           new Hymns(111,"111.Pa Phiri Kalelo (Old Rugged Cross)","Paphiri kalelo panaima mtanda, Chizindikiro cha nsoni, Ndikonda Mtandawo pomwe Wokondedwa, Anafera dziko lonseli.\n" +
                   "\n" +
                   "Tere ndifungatira Mtanda, Mpaka ndigwetsa mtolo wanga, Ndidzakangamira Mtandawo, Ndikusinthana ndi korona.\n" +
                   "\n" +
                   "Mtandawo wakale wonyozedwa m’dziko, Ndidabwa nawo kwambiri,\n" +
                   "Poti Mwana’nkhosa anachoka Mwamba, Kuusenza mpaka Kalvari.\n" +
                   "\n" +
                   "Mtandawo wakale wothiridwa mwazi, Umandikondikomera  ndithu,\n" +
                   "Poti pa Mtandapo Yesu anafera, Kuti andiyeretse mbu.\n" +
                   "\n" +
                   "Mtandawo wakale ndidzausungabe, Ndi kusenza thonzo lake,\n" +
                   "Mpaka tsiku lina adzandiitana, Ku ulemerero wake.\n"),
           new Hymns(112,"112.Mbuye Ndayamba Kuyenda (I'm Going Through)","Mbuye ndayamba kuyenda m’njira, Yakuwalitsidwa ndi kuwala kwanu,\n" +
                   "Ndatsanzika ndi zinthu zam’dziko, Ndi Mpulumutsiyo ndidzapyolatu.\n" +
                   "\n" +
                   "Ndipyolatu, ndipyolatu, Ndilipira mtengo wake ndithu, Ndidzayenda njira yonyozeka, Ndipyolatu, Yesu, ndipyolatu.\n" +
                   "\n" +
                   "Ena nayamba pa njira yino, Koma sadakhoza kuyenda liwiro, Angofuna njira yatsopano, Koma si ambiri akupyolatu.\n" +
                   "\n" +
                   "Nditsatiratu Ambuye yekha, Ndimonga Yakobo natsamira mwala,\n" +
                   "Sinditsata zodyerekezazo, Sindicheukatu, ndidzapyolatu.\n" +
                   "\n" +
                   "Tiye abale tiyende njira, Yopita kumwamba ku dzuwa losatha,\n" +
                   "Fulatirani mafano anu, Muyambe ndi Yesu, pyolani ndithu.\n"),
           new Hymns(113,"113.Wanditulutsa M'matopemo(He brought Me Out)","Ndinatsutsidwa ndi maso a Mbuye, Machimo adanditsitsa mu dzenje,\n" +
                   "Ndalira Mbuye m’matope ozama, Ananditukula, kuli kuwala,\n" +
                   "\n" +
                   "Wanditulutsa m’matopemo, Wandikhazika pa thanthwelo, Walonga nyimbo mtima mwanga, Nyimbo yothokoza, haleluya.\n" +
                   "\n" +
                   "Anakhazikitsa mapazi anga, Pa thanthwe lamphamvu, sindisunthidwa,\n" +
                   "Sindiopa kugwa pokhala pano, Ndaima pa chisomo ku mapeto.\n" +
                   "\n" +
                   "Anandipatsa nyimbo yothokoza, Ndiyimba usana ndimo usiku\n" +
                   "Mtima usefukira, ndiri mfulu, Mombolo anandipulumutsatu.\n" +
                   "\n" +
                   "Nkasimba za dzenje lija la mdima, Atate wayankha pemphero langa\n" +
                   "Pano nkhani ya chikondi ndiyimba, Uko ndidzayimba ndi oyera mtima.\n"),
           new Hymns(114,"114.Chitha Nchani Kundiyeretsa()Whata Can Wash Away My Sin?","Chitha nchani kund’yeretsa? Mwazi wa Ambuye Yesu; Nchiyani chindipulumutsa? Mwazi wa Ambuye Yesu.\n" +
                   "\n" +
                   "Chitsime ndi chokoma, chindiyeretsa bwino, Chinanso sindifuna, Mwazi wa Ambuye\n" +
                   "Yesu.\n" +
                   "\n" +
                   "Ndiyang’ana mtandawo; Mwazi wa Ambuye Yesu; Ndikhululukidwa nawo; Mwazi wa Ambuye Yesu.\n" +
                   "\n" +
                   "Zonse zina sizikwana, Mwazi wa Ambuye Yesu; Ntchito zanga sinditama, Mwazi wa Ambuye Yesu.\n" +
                   "\n" +
                   "Ndimakhulupira bwino, Mwazi wa Ambuye Yesu; Chilungamo changa ndicho Mwazi wa Ambuye Yesu.\n"),
           new Hymns(115,"115.Bwezi Ndi Yesu (Friendship with Jesus)","Bwenzi ndi Yesu ndikondwa kuti wafoka’ne, Ndipeze Bwenzi lotere londifikitsa m’Mwamba.\n" +
                   "\n" +
                   "Bwenzi ndi Yesu, timayanjana, Chikondichi nchodala, Yesu ndi Bwenzi langa.\n" +
                   "\n" +
                   "Bwenzilo loposa ena, Bwenzi losaleka, Bwenzi lopatsa chimwemwe, Bwenzi lokhalitsa.\n" +
                   "\n" +
                   "Bwenzilo linditsogoza panjira ya mdima, Bwenzi loongola bwato ndifike patsidya.\n" +
                   "\n" +
                   "Ndiye Bwenzi mu nthendazo, ndi Bwenzi mu imfa, Bwenzilo lindilowetsa nyumba ya Kumwamba.\n" +
                   "\n" +
                   "Bwenzi pakutha pa moyo, nsautso zikakha, Bwenzilo lindilowetsa nyumba ya Kumwamba.\n"),
           new Hymns(116,"116.Ndipita Kwathu(The Way of the Cross)","Ndipita kwathu panjira ya Mtanda, Palibe njira ina, Sindidzaona zipata zija,\n" +
                   "Nkataya njira ya Mtanda.\n" +
                   "\n" +
                   "Mtanda ndi njira ya kwathu, Mtanda ndi njira ya kwathu, Nkokondweretsa pozindikira\n" +
                   "Mtanda ndi njira ya kwathu\n" +
                   "\n" +
                   "Ndiyende njira yowazidwa Mwazi, Anayendamo Yesu, Kuti ndikwele Kumwamba\n" +
                   "kuja, Komwe kwathu kwa Mulungu.\n"),
           new Hymns(117,"117. Ndikayenda M'njira (Last Mile of the Way)","Ndikayenda m’njira yansautso, Ndikagwira ntchito yolimba, Ndidzam’ona Mfumu yokongola, Nkayenda mtunda wotsiriza.\n" +
                   "\n" +
                   "Nkayenda mtunda wotsiriza; Ndidzapuma tsiku likatha, Ndidziwa chimwemwe ndichipeza\n" +
                   "Nkayenda mtunda wotsiriza.\n" +
                   "\n" +
                   "Ngati ndifalitsa Uthengawu, Nkafuna nkhosa yotayika, Adzandifupira mphotho yanga, Nkayenda mtunda wotsiriza.\n" +
                   "\n" +
                   "Pansi pano pali kulekana, Ndi misozi imaoneka, Koma sikudzakhala zisoni,\n" +
                   "Nkayeda mtunda wotsiriza.\n"),
           new Hymns(118,"118. Ati Yesu Mbuyeyo(Jesus Paid it All)","Ati Yesu Mbuyeyo, Ofoka ndinutu, Mudikire m’pemphodi, ndidzapatsa mphamvutu.\n" +
                   "\n" +
                   "Yesu wathadi mangawatu, Unde ndinaiapa bii, watsuka ine mbu.\n" +
                   "\n" +
                   "Mbuye, ndamva leroli zamphamvu zanuzi, Zomwe zisanditsadi mtima wanga woti bii.\n" +
                   "\n" +
                   "Ine kanthu ndiribe kogula moyowu; Ndingotsuka mtimawu m’Mwazi wa Ambuye ‘nu\n" +
                   "\n" +
                   "Mmene ndifa inedi, kumwamba mzimuwu, Udzakwera komweko kumuona Mbuyeyo.\n" +
                   "\n" +
                   "Ndipo pakuima phe, pokhala Yesuyo, Ndidzamtama Mlunguyo kosaleka konseko.\n"),
           new Hymns(119,"119. Wafooka, Wataya Mtima(Tell it to Jesus)","Wafo’ka wataya mtima kodi? Simba Kwa Yesu, simba kwa Yesu;\n" +
                   "Chimwemwe chako chachoka kodi? Simba kwa Yesu yekha.\n" +
                   "\n" +
                   "Simba kwa Yesu, simba kwa Yesu, Ndiye bwenzi lomveka, Kulibe bwenzi lina lotere\n" +
                   "Simba kwa Yesu yekha.\n" +
                   "\n" +
                   "Misozi ili patsaya lako? Simba kwa Yesu, simba kwa Yesu; Ulikubisa machimo ako? Simba kwa Yesu yekha.\n" +
                   "\n" +
                   "Zikugwera zisoni zowawa? Simba kwa Yesu, simba kwa Yesu; Ukuopa zovuta za m’mawa ? Simba kwa Yesu yekha.\n" +
                   "\n" +
                   "Muopsedwa za tsiku la imfa? Simba kwa Yesu, simba kwa Yesu; Ukukhumba chimwemwe cha m’Mwamba? Simba kwa Yesu yekha.\n"),
           new Hymns(120,"120. Ndidzayimba Za Mlungu (Yes I'll Sing )","ndidzayimba za Mulungu, za kukonda kwakeko; Anatuma Mwana wake kundifera kalelo.\n" +
                   "\n" +
                   "Inde ndizayimba nyimbo, yakukonda kwakeko, Ndidzayimba ndi angelo, akukhala m’Mwambamo.\n" +
                   "\n" +
                   "Ndinachita mphulupulu, waiwala zonsezo, Ndinakhala ndi zoipa, wazichotsa zonsezo.\n" +
                   "\n" +
                   "Wandipatsa moyo wake, moyo wakuyera mbu; Ine ndiri mwana wake, wandilera inetu.\n" +
                   "\n" +
                   "Nduyamika Mbuye wanga, ndi kumlemekezatu; Ndipititsa mbiri yake, ya kukonda kwakeko.\n"),
           new Hymns(121,"121.Ndikuyang'anani (My Faith Looks Up to Thee)","Ndikuyang’anani Khtistu wa Kalvari, Mpulumutsi; Mundimve ndipempha, Mutsuke mtimanga, Lero thunthu langa ndi lanudi.\n" +
                   "\n" +
                   "Ndiri wolefuka, ndidzutse m’mtimanga, Ndi chisomo, Momga mnandifera, chikondinso changa, Chikhale choona, chonga moto.\n" +
                   "\n" +
                   "Pa dziko la mdima, nsoni zindizinga, Mnditsogoze, Mdima musandutse, pukutani m’sozi, Pa mbali yanuyi ndisachoke.\n"),
           new Hymns(122,"122.Anasokhana Pamodzi (Old time Power)","Anasonkhana pamodzi, m’chipinda cha pamwamba, Mzimu Woyera unagwa, Mbuye adalonjeza.\n" +
                   "\n" +
                   "Mbuye Mtumize mphamvu, Mbuye Mtumize mphamvu, Mbuye Mtumize mphamvu, Mubatize tonsefe.\n" +
                   "\n" +
                   "Mphamvuyo inatsikira mu mphepo ndi mkokomo, Nawagwera malilime ogawika amoto.\n" +
                   "\n" +
                   "Mphamvuyo inapatsidwa kwa makolo athuwo, Yalonjezedwa kwa onse okhulupira lero.\n"),
           new Hymns(123,"123. Yesu Bwezi La Ochimwa (Jesus What a Friend)","Yesu Bwenzi la ochimwa, Yesu wondikondabe, Ena samandikwanira, Yesu salephera’i.\n" +
                   "\n" +
                   "Aleluya Mpulumutsi, Aleluya Bwenzilo! Amakonda, amasunga, Ndimufuna Yesuyo.\n" +
                   "\n" +
                   "Yesu ndiye mphamvu yanga, ndilimbikitsetu; Poyesedwa ndi adani andipambanitsadi.\n" +
                   "\n" +
                   "Yesu atonthoza mtima ndidela nkhawa’ne, Pakukhala ndi chisoni andisangalatsabe.\n" +
                   "\n" +
                   "Yesu ndiye mtsogoleri, pakuyenda mnjiramo, Ndipo ndikafuna kugwa andigwira dzanjalo.\n" +
                   "\n" +
                   "Yesu ndimafuna Inu, mwapambana zonsezo, Mlamulire mtima wanga, mndikhalitse wanutu.\n"),
           new Hymns(124,"124.Poyamba Ndakondadi (Happy Day)","Poyambapo ndakonwadi, ntapeza Inu Mbuyetu, Ndiyimba nyimbo yomweyi, kukondwa sindikhala du.\n" +
                   "\n" +
                   "Kalelo! Kalero! Wandisambitsa m’mtimamo, Wandiweruza lomwelo, kupempha ndi kukondwako; Kalelo! Kalelo! Wandisambitsa m’mtimamo.\n" +
                   "\n" +
                   "Ndim’uza ndimakhalatu kunyumba kwake komweko; Mnyamata wake ndinutu, ndampatsa mtima wonsewo.\n" +
                   "\n" +
                   "Kunyumba ndidzanenadi, ndinapangana nayeko; Wamoyo sindimyenga’I, wakufa ndinka kwawoko.\n"),
           new Hymns(125,"125.Kuli Kinse ndi yesu (Anywhere With Jesus)","Kuli konse ndi Yesu ndidzapita, Kuli konse m’dziko anditsogola, Komwe kulibe Iye kumangoda, Kuli konse ndi Yesu sindiopa.\n" +
                   "\n" +
                   "Konseko, konseko, kopanda mantha, Kuli konse ndi Yesu ndidzapita.\n" +
                   "\n" +
                   "Kuli konse ndi Yesu sindi’ndekha, Ali Bwenzi loposa m’dziko lina, Nkana anditsogoza mu zidikha, Kuli konse ndi Yesu ndimyamika.\n" +
                   "\n" +
                   "Kuli konse ndi Yesu m’dziko lina, Ndifalitsa Uthenga kwa am’mdima, Ndakonzeka kupita ndi kukhala, Kuli konse ndi Yesu akaloza.\n" +
                   "\n" +
                   "Kuli konse ndi Yesu ndikagona, M’mene mthunzi wamdima undizinga, Podziwa nkadzuka sindiyendanso, Kuli konse ndi Yesu ndi kwathuko.\n" +
                   "\n"),
           new Hymns(126,"126.Aulendo Munka Kuti? (Wither Pilgrim Are You Going) ","Aulendo, munka kuti ndi zindodo m’manja mwanu? Paulendo tizipita, aitan Mbuye wathu; Pamapiri, pamadambo, tizipita komwe kwawo.\n" +
                   "\n" +
                   "Tizipita komwe kwawo, kuli dzikolo labwino, Tizipita komwe kwawo, kuli dzikolo labwino,\n" +
                   "\n" +
                   "Kodi simuona njira, inu anthu akufooka?  Ayi, atiperekeza Mbuye wathu wotikonda; Iye amakhala nafe, natitsogolera ife.\n" +
                   "\n" +
                   "Mundiuze, aulendo, muli ch’ani m’Mwamba muja? Ativekako zoyera, akorona natininkha; Moyo, moyo atipatsa, kwa Mulungu tidzakhala.\n" +
                   "\n" +
                   "Kodi inu, aulendo, ife titsagane nanu? Inde, mudze inu nonse, mudze nafe paulendo; Inde, mutiperekeze, Yesu atilinda ife.\n"),
           new Hymns(127,"127.Tamani Mphamvu Ya Yesu (All Hail the Power)","Tamani mphamvu ya Yesu, angelo amgwadire, Turutsanitu korona, mumveke Mbuyeyo, Turutsanitu korona, mumveke Mbuyeyo,\n" +
                   "\n" +
                   "Inu osankhidwa ake, oomboledwa ‘nu, Tamani Mpulumutsiyo, mumveke Mbuyeyo\n" +
                   "Tamani Mpulumutsiyo, mumveke Mbuyeyo.\n" +
                   "\n" +
                   "Anthu amitundu yonse pa dziko linotu, Alemekeze Mfumuyo, mumveke Mbuyeyo.\n" +
                   "Alemekeze Mfumuyo, mumveke Mbuyeyo\n" +
                   "\n" +
                   "Uko ndi oyera mtima tidzangwadiratu, Tidzayimbira kosatha, nkumveka Mbuyeyo,\n" +
                   "Tidzayimbira kosatha, nkumveka Mbuyeyo,\n" +
                   "\n"),
           new Hymns(128,"128.Kodi Uli Ndi Chisoni?","Kodi uli ndi chisoni choliritsa mtima wako? Kweza maso, ndi Atate akumvetsa zonsezi.\n" +
                   "\n" +
                   "Kodi umadandaula, ‘Mbale wanga waferanji? Kumbukira wakumtenga sapophonya konse ‘i.\n" +
                   "\n" +
                   "Mbale wako unamkonda, koma Yesu amkondetsa; Anamfuna nangomtenga; usamane Yesu ayi.\n" +
                   "\n" +
                   "Pakutsanzikana nanu ndi potseka maso ake, Imfa bi! Anangogona koma adzadzukanso.\n" +
                   "\n" +
                   "Chikondano sichithedwa; udzam’ona mbale wako, Kwathu komwe; zipirira mpaka ukafikako.\n" +
                   "\n" +
                   "Leroli chisoni chokha, tsiku lija kungokondwa; Kweza maso osalira; Yesu akukondadi.\n"),
           new Hymns(129,"129.Dzuwa Lapita","Dzuwa lapita, dzuwa lapita, Mlungu mutigonetse phee.\n" +
                   "\n" +
                   "Mdima wafika, mdima wafika, Mutisunge tonse tonse bwino.\n" +
                   "\n" +
                   "Tivomereze, tivomereze, Zakuchimwa zathu zonse.\n" +
                   "\n" +
                   "Mkhululukire, mkhululukire, Zoipazi zathu zonse.\n" +
                   "\n" +
                   "Lero tigone, lero tigone, Tigonemo mumtendere.\n" +
                   "\n" +
                   "Ndife ananu, ndife ananu, ‘Tate Mlungu wotikonda.\n"),
           new Hymns(130,"130.Bwezi Lathu Ndiye Yesu","Bwenzi lathu ndiye Yesu, Atikonda ifetu, Zifunsiro zathu zonse tipemphere Mbuyathu; Mtima phe tisowa tonse, tivutika chabeko, Kaamba sitimanka konse kumpemphera Mlunguyo.\n" +
                   "\n" +
                   "Tiri nazo zotiyesa, zitidetsa nkhawamu; Tisadandaule chabe, timpemphere Mbuyathu; Kodi tikaona wina timkhulupiratu? Yesu atidziwa bwino, timpemphere yekhayo.\n" +
                   "\n" +
                   "Kodi titolema nazo, zotiwawa m’mtimamo? Atipulumutsa Yesu, timpemphere Iyeyu; Kodi atothawa ‘bale?  Pempheratu Bwenzilo? Akusunga m’mkono mwake, udzapumuliramo.\n"),
           new Hymns(131,"131. Yesu Ndi Wanga (Blessed Assuarance)","Yesu ndi wanga ndidziwatu; Tsiku ndi tsiku ndinkondadi; Anandigula ndi mwaziwo, Anandipatsa Mzimu wake.\n" +
                   "\n" +
                   "Nyimbo yomweyi ndimyimbira, Yesu ndimtama tsiku lonse; Nyimbo yomweyi ndimyimbira,\n" +
                   "Yesu ndimtama tsiku lonse.\n" +
                   "\n" +
                   "Nkamvera Yesu ndikondwatu, Ndiyang’anitsa nkhope yake; Ndpo angelo apatsa ‘ne, Zokoma zake za Mbuyeyo.\n" +
                   "\n" +
                   "Ndine kapolo wa Mbuyeyo, Andigwiritsa ntchito zake; Ndimyembekeza abweranso,\n" +
                   "Adzanditenga kumwambako.\n"),
           new Hymns(132,"132.Ndidziwitsitsa (African Tune) ","Ndidziwitsitsa Yesu ndi wanga, Tsiku ndi tsiku ndimakondwera; Anandigula ndi mwazi wake; Anandipatsa Mzimu Woyera\n" +
                   "\n" +
                   "Mawu omwewo, nyimbo yomweyi, Yesu ndiwanga tsiku lonseli; Mawu owewo, nyimbo yomweyi, Yesu ndimtama tsiku lonseli.\n" +
                   "\n" +
                   "Nkamvera Yesu ndimakondwera, Ndiyang’anitsa nkhopeyo yake, Ndipo angelo anditengera, Ine chisomo ndi chuma chake.\n" +
                   "\n" +
                   "Ndine kapolo wa Mbuye wanga, Andigwiritsa zintchito zake, Ndimyembekeza adzabweranso, Adzanditenga, kwawo ndikhale.\n"),
           new Hymns(133,"133.Lidze Msanga Dzuwa Lanu","Lidze msanga dzuwa lanu lolonjezedwa, Ambuye; M’dalinena polawira kwa anyamata, Ambuye.\n" +
                   "\n" +
                   "Kuli chimwemxwe m’dzuwalo, lakufika Ambuye; Ha! Ha! Ambuye bwerani; Ha! Ha! Ambuye bwerani.\n" +
                   "\n" +
                   "M’dziko lino chimwemwecho chikudza ndi Yesu Mbuye; Mfumu yathu yakumwamba ndi dziko lonse lapansi.\n" +
                   "\n" +
                   "Adzakhala pampandopo wakuweruza makamu; Amitundu adzaima pamaso pa Mbuye Yesu.\n" +
                   "\n" +
                   "Adzanena kwa anthuwo akudzanjatu lamanja, Lowani ‘nu m’chikondwero cha Atate nthawi zonse.\n"),
           new Hymns(134,"134.Kalelo Anthu Onse ","Kalelo anthu onse ‘nachimwa kwa Mulungu, Mulungu anaona, naona tchimo lawo,\n" +
                   "Nafuna kuwaononga, Nafuna kuwaononga (x2).\n" +
                   "\n" +
                   "Mulungu anatuma, natuma mvula ija, Yadzadza dziko lonse, anafa anthu onse,\n" +
                   "Anafa m’mvula muja, anafa m’mvula muja (x2).\n" +
                   "\n" +
                   "Mulungu anatuma, natuma Nowa uja, Wamanga chombo chake, ndi chachi talitali,\n" +
                   "Nowayo nayendamo, Nowayo nayendamo (x2).\n" +
                   "\n" +
                   "Nowayo anatuma, natuma chikwangwala, Chatsika pansipansi, chosabwerera konse, Chithawa m’mtalitali, chithawa m’mtalitali (x2)\n" +
                   "\n" +
                   "Kutuma wabwereza, natuma nkhunda ija, Yatsika pamadzipo, yathyolatu mayani,\n" +
                   "Yampatsa Nowa yemwe, yampatsa Nowa yemwe (x2).\n" +
                   "\n" +
                   "Kalero Mbuye Yesu, ‘nafera anthu onse, Ndiyeno chombo chathu, tikabisala mommo, Tipulumuka mommo, tipulumuka mommo (x2)"),
           new Hymns(135,"135.Zokoma Ndithu Nthawizi (Sweet Hour of Prayer)","Zokoma ndithu nthawizi, kwa Mlungu zondifitsadi; Kumpando wachifumuwo, ndiuze zanga zonsezo, Zovuta zamumtimamu nditulapo pa Yesuyo, Pakuyesedwa ndinkatu kwa Mbuye wondikondayo.\n" +
                   "\n" +
                   "Zokoma inde nthawizi zotama dzina lomweli, La Yesu ndi woonayo, wondidalitsa ponsepo; Ndilakalaka Iyeyu wofera ine pansipa; Pakuda nkhawa ine bii, nditchula dzina lomweli.\n" +
                   "\n" +
                   "Zokoma etu nthawizi, ndicheza naye Mlunguzi; Komatu kwathu m’mwambamo kumuona ndi koposako; Povula ine thupili, ndilowa dziko lakedi; Ndidzati nthawi yomweyo, ‘Tsalani bwino pansipo.’"),
           new Hymns(136,"136.Pamtandapo, Pamtandapo (On the Cross)","Pamtanda, pamtanda, Yesu ‘nafera; Pamutupo chilemba, chisoni ine; Analira ‘Eloi, Mlungu wanga! Lama sabakatani, mwandisiyiranji?’\n" +
                   "\n" +
                   "Kumandako, kumanda Yesu nauka, Anaposa imfayo, watha zonsezi; Ndikondwera, Mbuyanga ‘naukadi; Sekelani nonsenu, Yesu ngwamoyo.\n" +
                   "\n" +
                   "Pakukwera kumwamba Yesu anati, ‘Musachoke m’mudzimu, pempheranitu,\n" +
                   "Mzimu Wakuyeradi adzabwera; Kuthangata nonsenu, kuti msafoke.’\n" +
                   "\n" +
                   "Uzanitu abale, onse alongo, Ndi amitundu yonse adzakondwera; Musaope ntchitoyo yokomadi, Mphotho yake kumwamba, moyo wosatha."),
           new Hymns(137,"137.Ndiyimba Mumtima Mokondwa (I Sing With Joy in My Heart)","Ndiyimba mumtima mokondwa, Ndi nyimbo yokoma, yoyera; Ndiyimba za Yesu Mbuyanga, Anditonthozane phee!\n" +
                   "\n" +
                   "Chete! Chete! M’mtima mtenderemu phee!  Udzera kwa Yesu wokonda, Mtendere mumtimamu.\n" +
                   "\n" +
                   "Pamtanda Mbuyanga ‘nafera, Akandichotsera zochimwa; Anandigulira mtendere,\n" +
                   "Anditonthoza ‘ne phee!\n" +
                   "\n" +
                   "Polamba Yesuyo Mbuyanga, Mumtima mtendere walowa; Mdalitso woposa ndapeza, Anditonthoza ‘ne phee!\n" +
                   "\n" +
                   "Pokonda Yesuyo, mtendere! Kunthawi yosatha, mtendere! Potsata Mbuyanga apatsa\n" +
                   "Mtendere mumtimamu.\n" +
                   "\n"),
           new Hymns(138,"138. Ife Sitidziwa Nthawi (Caught Up)","Ife sitidziwa nthawi yomwe abwera Mbuye, Kulandira ife ku nyumbako,\n" +
                   "Koma posachedwa anyamula ake kwawoko, Tidzakwatulidwa m’mlengalenga.\n" +
                   "\n" +
                   "Tidzakwatulidwa m’mlengalenga, Tidzakwatulidwa kukamuona, Abweratu msanga kudzatinyamula,Tidzakwatulidwa m’mlengalenga.\n" +
                   "\n" +
                   "Nthawi zina tipyolera madzi akuya ndithu, Ndi zisoni za Khristu tizimba,\n" +
                   "Tikumbuke walonjeza kukhala pafupitu, Tidzakwatulidwa m’mlengalenga.\n" +
                   "\n" +
                   "Tidzakhala nthawi za muyaya ndi mPulumutsi, Tikhumbatu tsikulo lifike;\n" +
                   "Paja masiku akugonera kwathu adzatha, Tidzakwatulidwa m’mlengalenga.\n"),
           new Hymns(139,"139.Kuli Dziko La Bwino(There's a Land)","Kuli dziko labwino m’Mwamba, Lakuwala koposa dzuwa, Yesu atikonzera malo,\n" +
                   "Pokhalira ife komweko.\n" +
                   "\n" +
                   "Bwinoli tipita, Tikomana mu dziko lija, Bwinoli tipita, Tikomana mu dziko lija.\n" +
                   "\n" +
                   "Tidzayimba komweko nyimbo, Za  abwino omvera Yesu; Sitidzamva chisomo ife,\n" +
                   "Tidzakondwa masiku onse.\n" +
                   "\n" +
                   "Tidzatama Atate wathu, Kuti Iye ‘napatsa Yesu, Kuchotsera zochimwa zonse\n" +
                   "Ndi kutidalitsira ife.\n"),
           new Hymns(140,"Mema Nkhondoyo (Sound the Battle Cry)","Mema nkhondoyo, wadza mdaniyo, Kweza mbendera ya Mbuye; Vala zidazo, yimba nyimboyo, Khazikikatu pa Mulungu.\n" +
                   "\n" +
                   "Haya anzathu, itilinda nkhondo, Limbanitu nkhondo nja Yesu, Musafooke, mthyole linga lawo, Mbuye ndiye wopambanayo.\n" +
                   "\n" +
                   "Mlungu mverani, mphamvu patseni, Tithandizeni, tipempha; Nkhondo itatha, titapambana, Tidzalandira korona.\n" +
                   "\n" +
                   "Mlake mdaniyo, myimbe m’njiramo, Mpaka nkhondoyo ileka; Zida konzani, mantha tayani, Pitikitsani adaniwo.\n"),
           new Hymns(141,"140.Tumphatumpha (Leap Leap My Soul)","Tumphatumpha moyo wanga, sanagalala ndi Mombolo; Kuombola kwa Yehova kwatuluka m’dziko lako.\n" +
                   "\n" +
                   "Mulungu wakwezekatu, chiombolo m’dziko lako, Wakwezekatu chiombolo, Wovundikira iwedi, Mzimu wanga ‘we wafunda, Lulutira moyo wanga.\n" +
                   "\n" +
                   "Vina vina moyo wanga, lulutira mtima wanga; Wa mawuwo a Yehova watuluka m’dziko lako.\n" +
                   "\n" +
                   "Yimbirira moyo wanga, mtendere wako wafika; Mbendera ya chiombolo waikwezetsa ndi Yesu\n" +
                   "\n" +
                   "Ukondwere moyo wanga, kuunika kuoneka, Ndi mdimawo uthawatu; lulutira moyo wanga.\n" +
                   "\n" +
                   "Usekere moyo wanga, ndi Yehova akufuna; Wakwezatu mbenderayo ya chiombolo, sekera.\n"),
           new Hymns(142,"142.Tamva Mawu Omwewa (We have Heard)","1.\tTamva mawu omwewo watitu Ysuyo, Mpulumutsi ndiyedi, Yesuyo, Yesuyo;\n" +
                   "Pita m’midzi monsemo, dziko lonse limvetu, Pita iwe konseko, mveratu Mbuyeyo.\n" +
                   "\n" +
                   "2.\tYimbadi za Iyeyo, amvetu antuwo, Kuti Yesu ‘nafadi kalero, kalero;\n" +
                   "Atikonda ifetu, natifera indedi, Achotsere tchimoli, Yesuyo, Yesuyo.\n" +
                   "\n" +
                   "3.\tBukitsani mawunso konseko, konseko; Aitana anthuwo ponsepo, ponsepo;\n" +
                   "Kodi wina samvatu, pitako, pitako’we, Angofuna onsewo, Yesuyo, Yesuyo.\n" +
                   "\n"),
           new Hymns(143,"Muli Ndi Ludzu Idzani (Oh,Ye That Trust)","1.\tMuli ndi ludzu, idani kumadzi amoyo, Imwani nonse kwaulere ku chitsime konko.\n" +
                   "\n" +
                   "2.\tMunka kangati kulawa madzi onyengera? Musataye mphamvu yanu, musataye chuma.\n" +
                   "\n" +
                   "3.\tImvani, Yesu akuti, ‘Chuma ndiri nacho, Landirani, yemwe amwa akhale ndi moyo.\n" +
                   "\n" +
                   "4.\tFunani Mlungu tsopano, akulindirani; Iye ndiye wachifundo, akulindirani.\n" +
                   "\n" +
                   "5.\tAli wokhulupilika, imvani nonsenu; Mtima wake usiyana ndi mitima yathu.\n" +
                   "\n" +
                   "6.\tMonga m’mwamba mupambana zonse pansi pano, Choncho maganizo ake apitira athu.\n" +
                   "\n"),
           new Hymns(144,"144.Ndifuna Yesuyo","1.\tNdifuna Yesuyo, Ambuyathu, M’mtendere ndinkemo mwa Iyeyo.\n" +
                   "\n" +
                   "Ndifuna Inu Yesu, Nthawiyi ndifuna; Kwa Yesu Ambuyathu ndifunako.\n" +
                   "\n" +
                   "2.\tNdifuna Yesuyo movutamo, Ndipulukemo mwa Iyeyu.\n" +
                   "\n" +
                   "3.\tNdifuna Yesuyo mokondwa ndi, Mowawa, adzemo ndi moyodi.\n" +
                   "\n" +
                   "4.\tNdifuna Yesuyo Woyeratu, Ndikhale wakeyo mwa Iyeyu.\n" +
                   "\n"),
           new Hymns(145,"145.Mtima Wa Mbuyako (In the Hartof Jesus)","1.\tMtima wa Mbuyako akukonda ‘we; Ndiye wakuona, wopirirabe, Ukasowa bwenzi, usaope bi; Chikondano chake chikwaniradi.\n" +
                   "\n" +
                   "2.\tAkukumbukira Yesu yemweyo; Kuyanjana naye muli moyomo, Uderanji nkhawa? Mpulumutsiyo, Atisamalira, atisungatu.\n" +
                   "\n" +
                   "3.\tMmunda wa Mbuyako muli ntchitomo; Amithenga ake ayigwirayo, Usaime chabe, usakhale du! Yesu akufuna umthandizetu.\n" +
                   "\n" +
                   "4.\tKwawo kwa Mbuyako udafikako; Mwaulemerero udzapuma phee, Usalowerere, mvera Yesuyo, Ati, ‘Mwana wanga bwera kwathuko.’\n"),
           new Hymns(146,"146. Mokomamtima Yesu Akuitan (Softly&Tenderly)","1.\tMokomamtima Yesu akuitana, Atiitana tonse, Ona pakhomo akuyembekeza,\n" +
                   "Ayembekeza tonse.\n" +
                   "\n" +
                   "Bwera kwathu, Wolema bwera kwathu; Mwa chosoni, mofatsa akuitana, Bwera wochimwa kwathu.\n" +
                   "\n" +
                   "2.\tBwanji uchedwa pakupempha Iye?  Alikupempha tonse, Bwanji unyodola zifundo zake?  Zifundo kwa tonse.\n" +
                   "\n" +
                   "3.\tNthawi ikutha, ikupitirira, Ipitirira tonse, Mdima wa imfa ukuyandikira, Uyandikira tonse.\n" +
                   "\n" +
                   "4.\tO, chikondi chake cholonjezedwa, Chalonjezedwa tonse, Tchimo lathu atikhululukira, Khululukira tonse.\n" +
                   "\n"),
           new Hymns(147,"147.Anthu Ali M'dima (Send the light)","1.\tAnthu ali m’mdima atoitanitsa, Unikani! Unikani! Alikumwazika mungawalanditse,\n" +
                   "Unikani! Unikani!\n" +
                   "\n" +
                   "Tumizani kuunikako, Kuoneketu kwa onsewo; Tumizani kuunikako, Nthawi zonsedi kuwaletu.\n" +
                   "\n" +
                   "2.\tTamva a ku Makedon’yako atero, Unikani! Unikani! Tititu, Ambuye tizinka komweko, Unikani! Unikani!\n" +
                   "\n" +
                   "3.\tTisaleme pakuchita zabwinozi, Unikani! Unikani! Tidziunjikire ngale zakumwamba,\n" +
                   "Unikani, Unikani!\n"),
           new Hymns(148,"Khritsu Anakhetsa Mwazi (At the Cross)","1.\tKhristu anakhetsa Mwazi, nafa Mfumu yanga, Wapatsiranji mutuwo kaamba ka ochimwa?\n" +
                   "\n" +
                   "Pa mtanda, pa mtanda ndinaunikiridwa, Katundu wa mtimanga anatha; Mchikhulupiriro ndinaonso, Tsono tsiku lonse ndakondwa.\n" +
                   "\n" +
                   "2.\tZompachikitsa pa mtanda ndi zochimwa zanga, Chisomo chodabwitsatu, chikondi choposa.\n" +
                   "\n" +
                   "3.\tDzuwa lija linabisa kuwalako kwake, M’mene Mlengi anafera olengedwa ake.\n" +
                   "\n" +
                   "4.\tNgongole sindingalipe ndi chisoni changa, Chomwe ndingathe kuchita, ndi kudzipeleka.\n"),
           new Hymns(149,"149.Monga Ndiri (Jesus as Iam)","1.\tMonga ndiri, wotsutsika, Koma Mwazi wakhetsedwa; Mwandi’tana, ndirinkudza,\n" +
                   "Mwana wa Mlungu, ndirinkudza.\n" +
                   "\n" +
                   "2.\tMonga ndiri, sindichedwa, M’moyo mwanga muli banga, Mwazi wanu umatsuka,\n" +
                   "Mwana wa Mlungu, ndirinkudza.\n" +
                   "\n" +
                   "3.\tMonga ndiri, wotengeka, Ndi mphepo ndi zokayika, Nkhondo m’kati, mantha panja, Mwana wa Mlungu, ndirinkudza.\n" +
                   "\n" +
                   "4.\tMonga ndiri, ndine wakhungu, Kuona kwanga kwa mzimu, Kumapezeka mwa Inu,\n" +
                   "Mwana wa Mlungu, ndirinkudza.\n" +
                   "\n" +
                   "5.\tMonga ndiri, mndilandire, Kukhulu’kira, kusambitsa, Lonjezo ndilikhulupira,\n" +
                   "Mwana wa Mlungu, ndirinkudza\n"),
           new Hymns(150,"150.Odala Ndi Onsewo(Blessed Are the Pure in Heart)","1.\tOdala ndi onsewo oyera m’mtima mwawo, Adzaonana ndi Mulungu, Yesu ndiye wawo.\n" +
                   "\n" +
                   "2.\tAmbuye anachoka Kumwamba mwini moyo. Wofatsa anakhala nafe, Mfumu ya chisomo.\n" +
                   "\n" +
                   "3.\tMumtima wakufatsa akonda kukhalabe, Asankha mtima wakuyera, Ndiwo nyumba yake.\n" +
                   "\n" +
                   "4.\tTifuna Inu, Mbuye, Mtininkhe mtima uwu, Wodzichepetsa wakuyera, woyenera Inu.\n"),
           new Hymns(151,"151.Kulibe Bwenzi (No Not One)","1.\tKulibe bwenzi longa Mbu’Yesu, kulibe, kulibe; Kulibe wina wotichiritsa, kulibe, kulibe.\n" +
                   "\n" +
                   "Amadziwa zovuta zathu, atsogoza nthawi zonse, Kulibe bwenzi longa Mbu’Yesu, kulibe, kulibe.\n" +
                   "\n" +
                   "2.\tBwenzi loposa lokwezekedwa, kulibe, kulibe; Pena loposa lochopetsedwa, kulibe, kulibe.\n" +
                   "\n" +
                   "3.\tKodi mmodzi wake asiyidwa? Kulibe, kulibe, Kaya wochimwa wokanizidwa? Kulibe, kulibe.\n" +
                   "\n" +
                   "4.\tMphatso yoposa inapatsidwa? Kulibe, kulibe; Nyumba Kumwamba idzamangidwa? Kulibe, kulibe.\n" +
                   "\n"),
           new Hymns(152,"152.Gwira Akumira (Rescue the Perishing)","1.\tGwira akumira, funa akufa, Afumule ku tchimo ndi manda, Lirira wochimwa, kweza wakugwa, Auze za Yesu Mpulumutsi.\n" +
                   "\n" +
                   "Gwira akumira, funa akufa, Yesu afuna kuwapulumutsa.\n" +
                   "\n" +
                   "2.\tNkana akumyoza, akulindabe, Alinfiratu wovomereza, Uwakokosetu, pempha mofatsa, Yesu akhuku’kila wobwera.\n" +
                   "\n" +
                   "3.\tMtima wa munthuyo unatswanyika, Koma chisomo chidzam’bwezanso; Poona chikondi, adzadzutsidwa, Mtima wosweka udzachiritsa\n" +
                   "\n" +
                   "4.\tGwira akumira, ndi ntchito yako, Posowa mphamvu, Mbuye apatsa; Pindula miyoyo, ibwezerenso, Uza wolowerera za Yesu.\n" +
                   "\n"),
           new Hymns(153,"153.Kasupe Ali Wodzadza (There is a Fountain)","\n" +
                   "1.\tKasupe ali wodzaza nfi Mwazi wa Yesu; Omwe asamba mwa uyu, ataya zoipa.\n" +
                   "\n" +
                   "2.\tWoba wakufa ‘napenya Kasupe, nakondwa; Ndimo inenso mwa uyu, ndisamba ndiyera.\n" +
                   "\n" +
                   "3.\tMwazi wa Yesu wokondwa ukhala wamphamvu, Kwa ana onse a Mlungu, uchita kuombola.\n" +
                   "\n" +
                   "4.\tM’mene ndapenya mwazi wa mabala anuwo, Kukonda kwanu nditama kwa kutha kwa moyo.\n" +
                   "\n" +
                   "5.\tKumwamba ndikayimbanso zimphamvu za Mlungu, Zopulumutsa onsewo omvana ndi Yesu.\n"),
           new Hymns(154,"154.Ndamva Alikuitana (Where he Leads Me)","1.\tNdamva alikuitana (x3) ‘Senza mtanda wako, ndisate.’\n" +
                   "\n" +
                   "Komwe anditsogolera (x3) Ndinka naye, njira yonseyo.\n" +
                   "\n" +
                   "2.\tNdidzamtsatira m’mundamo (x3) Ndinka naye njira, yonseyo.\n" +
                   "\n" +
                   "3.\tNdinka naye m’chiweruzo (x3) Ndinka naye njira yonseyo.\n" +
                   "\n" +
                   "4.\tAdzandipatsa chisomo (x3) Anka nane njira yonseyo.\n" +
                   "\n"),
           new Hymns(155,"155.Ndikhumba Dziko Lampumulo (Well Work til Jesus Comes)","\n" +
                   "1.\tNdikhumba dzilo lampumulo, ndidzaliona liti? Ndidzagwetsa zida zankhondozi,\n" +
                   "Ndi kupita kwathu.\n" +
                   "\n" +
                   "Tidzagwira ntchito, Asanadze Yesu Tidzagwira ntchito, mpaka tinka kwathu.\n" +
                   "\n" +
                   "2.\tNdapeza mpumulo wa Yesu, nati ndisayendenso, Nditsamira pa chifuwa chake,\n" +
                   "Mpaka ndinka kwathu.\n" +
                   "\n" +
                   "3.\tNdakhala pambali ya Mbuye, sindidzasokeranso, Mwa Iye sindiopa imfa\n" +
                   "Ndidzafika kwathu.\n"),
           new Hymns(156,"156.Ndiyenda M'kuunikaku (March On)","1.\tNdiyenda m’kunikaku, Ndiyenda, ndiyenda mdidi, M’mapazi a Mbuye wathu,\n" +
                   "Ndiyenda, ndiyenda mdidi.\n" +
                   "\n" +
                   "Kolasi loyamba\n" +
                   "Mwinjiro mbu! Korona njo. Zeze, Nyumba yokomatu, Chogonjetso, Chimwemwenso,\n" +
                   "Nzanga pofikako\n" +
                   "\n" +
                   "Kolasi lachiwiri\n" +
                   "Yesu Mpulumutsi, wasambitsa mtima, Ndakondwa mu chikondicho, Ndakhala, ndakhalatu pa Chitsime.\n" +
                   "\n" +
                   "Kolasi lachitatu\n" +
                   "Yesu Mpulumutsi wanga wandisambitsa, Nalipa dipo langa pa Kalvari, Chikondi chofera\n" +
                   "chandikondweretsatu, Ndidzamtumikira nthawi zonse.\n" +
                   "\n" +
                   "2.\tTipyola nkhondo za uchimo, Ndiyenda, ndyenda mdidi; Mwa Mbuye ndogonjetsatu, Ndiyenda, ndiyenda mdidi.\n" +
                   "\n" +
                   "3.\tOipa akanyodola, Ndiyenda, ndiyenda mdidi, Chikondi chichotsa mantha,\n" +
                   "Ndiyenda, ndiyenda mdidi.\n" +
                   "\n" +
                   "4.\tMbendera yathu ili njo, Ndiyenda, ndiyenda mdidi; Tilalikatu ponsepo,\n" +
                   "Ndiyenda, ndiyenda mdidi.\n" +
                   "\n"),
           new Hymns(157,"157.Yesu Amema Ubwere (Jesus is Calling)","1.\tYesu amema ubwere kwathu, Akuitana, akuitana; Kuwalako kwa chikondi chake, Bwanji ulikuthawa?\n" +
                   "\n" +
                   "Akuitana, akuitana, yesu mfatsa, Alikuitana lero.\n" +
                   "\n" +
                   "2.\tYesu amema udzapumule, Akuitana, akuitana; Tula katundu, udalitsidwe, sadzakutaya kunja.\n" +
                   "\n" +
                   "3.\tYesu alinda, ubwere lero, alindira, alindira; Gwada, uvomereze machimo, usamazengeleza.\n" +
                   "\n" +
                   "4.\tYesu adandaulira iwe, mvera lero, mvera lero; Khulupirira, udzakondwera, pita kwa Iye Msanga.\n" +
                   "\n"),
           new Hymns(158,"Dzuwa Lapita (Now the Day is Over)","1.\tDzuwa lapita, wadza mdimawo, Nthunzi wa madzulo wagwa m’mwambamo.\n" +
                   "\n" +
                   "Zithwanima mbu! Zonse ziri m’tulo, Pansi pali du! M’mwambamo nyenyezi.\n" +
                   "\n" +
                   "2.\tYesu, mutipatse tulo toti phee! Ndi mdalitso wanu Mundigonetse’ne.\n" +
                   "\n" +
                   "3.\tM’patse ana’ng’ono alotemo mbee! Anthu a ulendo, M’sungesungebe.\n" +
                   "\n" +
                   "4.\tMutonthoze mtima mopwetekawo, Akutsata tchimo M’letse onsewo.\n" +
                   "\n" +
                   "5.\tWonsewu usiku andisunga’ne, Amithenga anu akuyera mbee!\n" +
                   "\n"),
           new Hymns(159,"159.Ndilira Ine (A Closer Walk)","1.\tNdilira ine kukayenda m’njira ndi Mulungu, Ndirira njali ndikaone njira ya kwa Yesu.\n" +
                   "\n" +
                   "2.\tChimwemwe chija cha mumtima ndinalwa kale, Poyambatsata ine Yesu, chiri kuti tere?\n" +
                   "\n" +
                   "3.\tKalelo m’mtima ndinakondwa, tere ndingolira, Zokoma zonse za pa dziko sizindikwanira.\n" +
                   "\n" +
                   "4.\tMundichotsere tchimo lonse ndinakonda kale, E. Muligwetse kuti ndinu Mfumu Mukakhale.\n" +
                   "\n" +
                   "5.\tMkatero ndidzayenda m’njira ndi Mulungu wanga; Idzandiunikira nyali njira ya Kumwamba.\n"),
           new Hymns(160,"Ndatulatu Katundu (Living Where the Healing Waters Flow)","1.\tNdatulatu katundu wanga m’dziko la Kenani, Ndakhala pali mtsinje wochiza;\n" +
                   "Sindiyendanso m’Chipululu cha kukayika, Ndakhala pali mtsinje wochiza.\n" +
                   "\n" +
                   "Ndiri pagombe, O ndiri pagombe, Ndakhala pali mtsinje wochiza; Ndiri pagombe, O ndiri pagombe, Ndakhala pali mtsinje wochiza.\n" +
                   "\n" +
                   "2.\tNao Aislayeri achikhulupiriro, Ndakhala pali mtsinje wochiza; Ndatsozodwa nfi mtambowo wa moto lero, Ndakhal pali mtsinje wochiza\n" +
                   "\n" +
                   "3.\tWakhuta mtima wanga ndi Mana a Kumwamba, Ndakhala pali mtsinje wochiza;\n" +
                   "Sindimwamvanso ludzu ndamwa madzi am’Mwala, Ndakhala pali mtsinje wochiza.\n" +
                   "\n" +
                   "4.\tNdiyimba haleluya, moyo wanga uli nji, Ndakhala pali mtsinje wochiza;\n" +
                   "Ndapuma m’malonjezo, ndakonzeka mu Mwazi, Ndakhala pali mtsinje wochiza.\n" +
                   "\n"),
           new Hymns(161,"Alikudza Wansoni Munthu (He is Coming the Man of Sorrow)","161)\tALIKUDZA WANSONI MUNTHU\t-  Ab He is Coming the Man of Sorrow\n" +
                   "\n" +
                   "1.\tAlinkudza wansoni munthu wakukhala Kumwamba, Alinkudza m’ulemerero, ndiye Munthu wamtanda.\n" +
                   "\n" +
                   "Aleluya, Aleluya, alinkudza kwaife; Ndi chimwemwe tidzamkomana pakufika Ambuye.\n" +
                   "\n" +
                   "2.\tAlinkudza Ambuye Yesu Wakuphedwa padziko, Alinkudza kukhaa Mfumu Yoweruza maiko.\n" +
                   "\n" +
                   "3.\tPakufika asonkhanitsa anthu ake oyera; Adzafika m’mitundu yonse omwe Iye ‘nafera.\n" +
                   "\n"),
           new Hymns(162,"162.Ambuye Ndifuna Nditsekenitu (Whither Than Snow)","1.\tAmbuye ndifuna mundisuketu, Mukhalitse ndine mumtimangamu, Muthyole zonsezo zodetsa ‘netu, Musambitse ine ndiyere mbu!\n" +
                   "\n" +
                   "Ndiyere mbu! E. ndiyere mbu! Musambitse ine ndiyeretu mbu!\n" +
                   "\n" +
                   "2.\tAmbuye chotsani zonse zomwezo, Zakundisautsa mumtimangamu; Ndileke zangazo zoipa ‘netu, Musambitse ine ndiyeretu mbu!\n" +
                   "\n" +
                   "3.\tKumwamba ndiona Ambuyangayo, Mudzandithandiza nditsate ‘nemo; Mudzandichotsera zoletsa ‘netu; Musambitse ine ndiyeretu mbu!\n" +
                   "\n" +
                   "4.\tChifukwa cha ichi ndipempheratu, Ndidikira Inu Ambuyanga’nu; Ndikhulupirira mwazi woti pyu; Musambitse ine mdiyeretu mbu!\n" +
                   "\n"),
           new Hymns(163,"163.Yesu Anditana (I am Coming Long)","\n" +
                   "1.\tYesu and’itana, Adzandiyeretsa, Ndi mwazi wake wotaya, Pa phiri Golgota.\n" +
                   "\n" +
                   "Ndirikudzatu, ndidza kwa Inu, Munditsuke m’mtimamo, Ndi mwazi wanuwo.\n" +
                   "\n" +
                   "2.\tNdafooka, ndaipa Mundilimbitsetu, Mundiyeretse konseko, Ndiyereyere mbu!\n" +
                   "\n" +
                   "3.\tAtero ndaniyo?  Ndi Yesu wabwino, Apatsa mvano, mtendere, Ndi mphamvu m’mtimamo.\n" +
                   "\n" +
                   "4.\tYesu akhazika zonse za m’katimo, Nalonga Mzimu Woyera, Munafoipamo.\n" +
                   "\n" +
                   "5.\tNditama mwaziwo! Ndatama chifundo! Nditama Yesu Ambuye, Nditenga mphamvu naye.\n"),
           new Hymns(164,"164. Naw'thenga Wa Mbuye (Look and Live)","1.\tNaw’Uthenga wa Mbuye, haleluya, Uthengawu ndikupatsa, Mwalembedwa m’Mawu ake, haleluya, Poyang’ana ukhale moyo.\n" +
                   "\n" +
                   "Yang’ana mbale wanga, Kwa Yesu kuli moyo, Mwalembedwa m’Mawu ake, haleluya,\n" +
                   "Poyang’ana ukhale moyo.\n" +
                   "\n" +
                   "2.\tUthenga wa chikondi, haleluya, Kwa iwetu bwenzi langa, Uchokera kumwamba, haleluya, Kwa Yesu ndipo ngoona.\n" +
                   "\n" +
                   "3.\tMoyo waperekedwa, haleluya, Kwa iwe, moyo wosatha, Ngati ungoyang’ana, haleluya, Kwa Yesu wopulumutsa.\n" +
                   "\n" +
                   "4.\tNanenso ndinadza, haleluya, Kwa Yesu, nandichiritsa, Nditakhulupirira, haleluya,\n" +
                   "Iye anandipulumutsa.\n"),
           new Hymns(165,"165.Gwira Zintchito Zako (Work for the Night is Coming)","1.\tGwira zintchito zako, udza usikuwo; Yamba mamawa ndithu msangamsangatu,\n" +
                   "Gwiranso msana monse potentha dzuwalo, Gwira tsopano ntchito; udzalekadi.\n" +
                   "\n" +
                   "2.\tNtchito za Yesu gwira, udza usikuwo, Lero lonseli gwira, udzapumatu, Gwiratu tsiku lonse ntchito zofunika; Gwira tsopano ntchito; udzalekadi.\n" +
                   "\n" +
                   "3.\tMkhristu gwira ntchito, udza usikuwo, Pakupendeka dzuwa, osapumapo, Gwira madzulo omwe kutada mdima bi! Tsono zintchito zako zatha zonsezi.\n" +
                   "\n"),
           new Hymns(166,"166.Penyetsetsa Yesu (Look to Jesus)","1.\tPenyetsetsa Yesu, mtima wosauka, Anafera iwe, idza numule; Iye anachotsa nsoni ndi zoipa, Penyetsetsa Yesu ndi kukhulupira.\n" +
                   "\n" +
                   "2.\tPenyetsetsa Yesu likatentha dzuwa; Yachuluka ntchito mphamvu idzakula, Akonzera kwawo nyumba zokhalamo, Penyetsetsa Yesu, mtsate tsopano.\n" +
                   "\n" +
                   "3.   Penyetsetsa Yesu pogwirana nawo, Nkhondo ikavuta, tamva Mbuye wako;\n" +
                   "Achuluka adani, iwe ungofooka, Penyetsetsa Yesu, mantha adzachoka.\n" +
                   "\n" +
                   "4.\tNdipo pakulowa m’dziko la Kumwamba, Udzapeza komwe onse adzatama;\n" +
                   "Mwa zowala zija za Kumwamba kwawo, Udzapenya maso Yesu Mbuye wako.\n"),
           new Hymns(167,"167.Paphiri ndi Padambo","1.\tPaphiri ndi padambo, ponsepo pali Mlungu, Poyenda ife mnjira mpoima pali Mlungu, Kokwera maganizo, komweko kuli Mlungu, Kumwamba ndi pansipo, ponsepo pali Mlungu.\n" +
                   "\n" +
                   "2.\tNdi maso a Mbuyathu Apenyetsetsa ife; Amadalitsa onse akumkhulupirira;\n" +
                   "Amamva timbalame, naveka dziko lonse; Sataya tizirombo, asunga zina zonse.\n" +
                   "\n" +
                   "3.\tOkwawa pansi inu, oyenda m’madzi inu, Oyes dziko nkwanu, am’lengalenga inu,\n" +
                   "Nonsenu ntchito zake, muona tsiku n’tsiku, Saleka kusamala ndi kudalitsa inu.\n" +
                   "\n" +
                   "4.\tNditama mphamvu yake ya Mlungu yondizinga; N’kafoka an’limbitsa, n’kadwala andichiza; Pakundisiya bwenzi Mulungu ali paja.  N’kalowa imfa yomwe alipo Mlungu wanga.\n"),
           new Hymns(168,"Yesu Afuna Iwe Unke Kwawoko (Follow,Follow)","1.\tYesu afuna iwe unke kwawoko, Lowani m’njira yake yakuyerayeratu,\n" +
                   "Anadzera m’Mwamba kutiperekezako, Yamba msanga iwe kunka kwanuko.\n" +
                   "\n" +
                   "Tsata, tsata, nditsatadi Yesu, Iwetu, iwetu, ukatsatanso, Tsata, tsata, nditsatadi Yesu,\n" +
                   "Inu nonse mukatsate Mbuyeyo.\n" +
                   "\n" +
                   "2.\tNgati umtsata Mpulumutsi wanuyo, Udzakhaliranso kuli Mbuye wakoyo,\n" +
                   "Adzapulumutsa thupi, mzimu wakonso, M’mphamvu ndi ulango wa zoipazo.\n" +
                   "\n" +
                   "3.\tKunsi kudambo, pena m’mwamba m’phirimo, Pomwe pali Yesu ndidzayendayendapo, Andiperekeza bwino m’njira yakeyo, Kuli mzinda wa Mulungu wangayo.\n"),
           new Hymns(169,"169.Mtsiku Komaliza (We'll All Be There)","1.\tM’tsiku lomaliza, potchula maina, Oyera akamuona Ambuye, Mmene ogonera akafika kwawo, Tiripo, Myamike, tiri tonse.\n" +
                   "\n" +
                   "Tiripo (tiripo), tiripo, (tiri tonse) Pa tsiku lodalalo (Tsilu lalikulu ndithu), Oyera (akafika) akafika (akafika) Tiripo, Myamike, tiri tonse.\n" +
                   "\n" +
                   "2.\tMmene ‘omboledwa adzayimba nawo, Nyimbo ya angelo oyerawo, Poomba mazeze ndi zoyimbirazo, Tiripo, Myamike, tiri tonse.\n" +
                   "\n" +
                   "3.\tSitidzatsazika kwathuko Kumwamba, Katundu ndi nkhawa zidzachoka,\n" +
                   "Yesu adzanena, ‘Lowa m’chikindwero,’ Tiripo, Myamike, tiri tonse.\n" +
                   "\n"),
           new Hymns(170,"170. Mmawa Tizifesa (Being in the Sheaves)","1.\tMmawa tizifesa mbewu zakukoma, Msana ndi usiku tizifesa momwe,\n" +
                   "Nyengo yamasika tidzatema m’munda, Tidzabwera tonse ndi zipatsozo.\n" +
                   "\n" +
                   "Ndi zipatsozo, ndi zipatsozo, Tidzabwera tonse ndi zipatsozo (x2)\n" +
                   "\n" +
                   "2.\tTizifesa m’dzuwa, tizifesa m’mthuzi, Sitiopa ife mtambo ndi chisanu;\n" +
                   "Athatu masika, ntchitozi zidzatha; Tidzabwera tonse ndi zipatsozo.\n" +
                   "\n" +
                   "3.\tTingolira kaya koma tidzafesa, Mbewu za Ambuye, ntchitoyo nja Yesu;\n" +
                   "Adzachotsa msozi, adzatilandira, Tidzabwera tonse nfi zipatsozo.\n" +
                   "\n"),
           new Hymns(171,"171.Ndinkayenda Mu Mdima Bi (Sunlight, sunlight)","1.\tNdinkayenda mu mdima bi, mpaka wadza Yesu, Nawalitsa chikondicho, nachotsa mdimawo.\n" +
                   "\n" +
                   "Kwacha, kwacha, mmoyo mwangamu, Kwacha, kwacha, mnjira monsemu, Yesu analowa nachotsa tchimo, Nawalitsa m’mtimanga chikondicho.\n" +
                   "\n" +
                   "2.\tMitambo ikandizinga, mphepo zikaopsa, Ngakhale kwada padziko, kwacha m’moyo mwanga.\n" +
                   "\n" +
                   "3.\tPoyendamo mkuwalako timayanjanatu, Ndithanthamira za Mwamba, dziko liri m’mbuyo.\n" +
                   "\n" +
                   "4.\tNdiyendayenda m’mundamo, nditsika kudambo, M’dzuwa la chikondi chake ndikolola m’moyo.\n" +
                   "\n" +
                   "5.\tNdimuona posachedwapa, Mwini kuunikako, Kuwala kwa nkhope yake sikutha konseko.\n"),
           new Hymns(172,"172.Haya! Nzanga (Hold the Fort)","1.\tHaya! ‘nzanga taonani yoonekayo, Yakumwamba iti: ‘Yesu alikudzako.’\n" +
                   "\n" +
                   "Kanganani nkhondo yanu ndi mbendera mbu, Tivomere: ‘Inde Mbuye mtithangatetu.’\n" +
                   "\n" +
                   "2.\tAmizimu yakuipa asatsabe, Tikanize zakuipa zotisunga ‘fe.\n" +
                   "\n" +
                   "3.\tMdani adza nazo mphamvu, koma ifetu, Tidzamthetsa nkhondo yake tim’ingitsetu.\n" +
                   "\n" +
                   "4.\tYesu, ‘Ndidza msanga, Thangateni phee! M’bweze mawu akulimba, ‘Tikanganabe.’\n" +
                   "\n"),
           new Hymns(173,"173.Mtima Wanga Uyamika (Praise My Soul)","1.\tMtima wanga uyamike Mfumu wakumwambako; Anandiombola ine nanditsuka m’mtimamo.\n" +
                   "\n" +
                   "Ife tonse, ife tonse, (tiyamike Mlunguyo) x2\n" +
                   "\n" +
                   "2.\tTiyamike Mlungu wathu kaamba ka chifundocho; Nthawi zonse sasanduka Mlungu wathu yemweyo.\n" +
                   "\n" +
                   "3.\tNthawi zonse monga ‘Tate atisamaliratu, Atisunga m’manja mwake, atipulumutsatu.\n" +
                   "\n" +
                   "4.\tAnthu a mitundu yonse, ndipo a kumwambako, Yamikani Mlungu wathu, ndiye wakukomatu.\n" +
                   "Anthu onse, anthu onse, (ayamike Mulunguyo) x2\n" +
                   "\n"),
           new Hymns(174,"174.Limba Mtima Mbale Wanga (Courage Brother)","1.\tLimba mtima mbale wanga, usapunthwe m’njirayi; Onatu nyenyezi ija ikutsogoleradi; Tamveratu Mlungu yekha, chita zolungama’we, Yenda bwino, khulupira, Mbuyeyo, Mbuyeyo, Mbuyeyo, Ndikuchita zakezi.\n" +
                   "\n" +
                   "2.\tTaya zako zochenjera, taya zamumdimanso; Nthawi zonse khulupira, chita zolungazo; Usayang’anire wina m’nkhondo yako yomweyi, Koma m’zonse khulupira, Mbuyeyo, Mbuyeyo, Mbuyeyo.  Ndikuchita zakezi.\n" +
                   "\n" +
                   "3.\tLeka zakuipa zako, myambi yonse yoti bii, Usakhulupire mommo, tamveratu Mbuyedi; Adzadan nawe ena, ena adzkonda ‘we, Kweza maso, khulupirira, Mbuyeyo, Mbuyeyo, Mbuyeyo.  Ndi kuchita zakezi.\n" +
                   "\n" +
                   "4.\tMawu ake atipatsa mphamvu ndi mtenderenso, Bwino atitsogolera, tikhulupirira ‘wo, Limba mtima, usapunthwe m’njira yamumdimayi; Yenda bwino, khulupirira,\n" +
                   "Mbuyeyo, Mbuyeyo, Mbuyeyo.  Ndi kuchita zakezi\n"),
           new Hymns(175,"175.Poyesedwa Ine (The Hour of Trial)","1.\tPoyesedwa ine Yesu mudzetu, Mundipempherere ndisachimetu; Mukaona kuti ndilefukatu, Mbuye mndilimbitse nazo mphamvutu.\n" +
                   "\n" +
                   "2.\tNdi zapansi pano ndikokedwadi; Koma ndi chisoni mndiphunzitsedi; Ndisaiwalire za Getsemane, Pena mtanda wanu Yesu Mbuye ‘Nu.\n" +
                   "\n" +
                   "3.\tMukandipweteka, ndipirirapo; Nsembe yanga ndiyo, landirani’yo; Ndikachita mantha sindithawa’I; Mtima udzalimba, ndidzaima nji!\n" +
                   "\n" +
                   "4.\tPakumalizidwa moyo wangawu, Pomwalira ine, mudze Mbuyutu; Ndidzadzipereka m’manja mwanumo; Mpulumutsi Yesu Mndilandireko.\n"),
           new Hymns(176,"176.Chikondi Chodabwitsa (Isn't He Wonderful)","1.\tChikondi chodabwitsa ndithu, Chofikitsa Mbuye kudziko; Machimo athu  atsukidwe; Mu Mwazi wakewo; tiri mbu.\n" +
                   "\n" +
                   "Ali wodabwitsa, Yesu Mbuyathuyo, Ali Wodabwitsa, Yesuyo; Diso silinaona, Khutunso silinamve, Ali Wodabwitsa, Yesuyo.\n" +
                   "\n" +
                   "2.\tM’mwawu mwake munali mphamvu, Nyanja inachmchitira bata, Opunduka nachiritsidwa, Aziwanda anamumvera.\n" +
                   "\n" +
                   "3.\tPochoka anatuma Nkhoswe, Nakwanitsa malonjezano; Mphamvu yake anatipatsa;\n" +
                   "‘Mudzachita zoposa izi.’\n" +
                   "\n" +
                   "4.\tMwa chikondi Anapemphera, ‘Anzanga akhale amodzi,’ Tiziyesanso kuyanjana,\n" +
                   "Mu mzimu kukwanitsa nthawi.\n"),
           new Hymns(177,"177.T'yenitu AKhritsu (Onward Christian Soldiers)","1.\tT’yenitu Akhristu, nkhondo tiigwire, Yesu Mbuye wathu atitsogolera;\n" +
                   "Mfumu wathu mwini atipatsa moyo; Taonanitu mbendera yailowa nkhondo!\n" +
                   "T’yenitu Akhristu, nkhondo tiigwire, Yesu Mbuye wathu atitsogolera.\n" +
                   "\n" +
                   "2.\tNkhondo ya Satana idzakuthawani; T’yenitu Ahristu, kaipambanani;\n" +
                   "Idzanjenjemera mukafuulitsatu; Yimbitsanitu anzathu, mau mukwezetse.\n" +
                   "\n" +
                   "3.\tMpingo wa Mulungu uli ngati nkhondo; Titsagane nawo ana a Mulungu,\n" +
                   "Sitipatukan, ndifetu amodzi, Ch’yembekezo, chikondano, chonse ndi chimodzi.\n" +
                   "\n" +
                   "4.\tT’yenitu anzathu tizithandizana, Yimbirani nafe nyimbo zopambana;\n" +
                   "Khristu ayanera mphamvu ndi ulemu; Tidzimlemekeza kwao komwe kuli Yesu.\n" +
                   "\n" +
                   "\n"),
           new Hymns(178,"178.Nkhani Ya Chikondi (Wonderful Story of Love)","1.\tNkhani ya Chikondicho, mundisimbirenso, Nkhani ya Chikondicho, mbiri yosafayo,\n" +
                   "‘Ngelo anaidziwitsa, ‘Busa anailandira, Wochimwa khulupirira! Nkhani ya Chikondicho.\n" +
                   "\n" +
                   "Yodabwitsa, yodabwitsa, yodabwitsa, Nkhani ya Chikondicho.\n" +
                   "\n" +
                   "2.\tNkhani ya Chikondicho, iwe wakutali, Nkhani ya Chikondicho, akuitanabe,\n" +
                   "Kuchokera pa Kalvari,  Pali chitsime cha Mwazi, Pakukhala pachiyambi,\n" +
                   "Nkhani ya Chikondicho.\n" +
                   "\n" +
                   "3.\tNkani ya Chikondicho, Yesu apumitsa, Nkahni ya Chikondicho, onse akuyera,\n" +
                   "Akapumule ndi ena, Omwe anatsogolera, Ayimba mwa kukondwera,\n" +
                   "Nkhani ya Chikondicho.\n"),
           new Hymns(179,"179.Akhritsu Limbikani","1.\tAkhristu limbikani, imani mtima nji! Mbendera nyamulani, msatenthemere ‘I;\n" +
                   "Wotsogolera wathu ndi Mwana wa Mulungu; Adzagonjetsa onse adani athuwo.\n" +
                   "\n" +
                   "2.\tTigwire nkhondo yomwe ya Mbuye wathuyo; Tileke zakuipa zokhala m’timamo;\n" +
                   "Sitikwanira tokha kuleka zathu zmwe, Koma Mbuyathu Yesu atithangatatu.\n" +
                   "\n" +
                   "3.\tTsopano timenyana ndi zakuipazi; Pamene nkhondo yatha tidzanka kwathuko;\n" +
                   "Yesu adzalandira ankhondo ake onse; Adzakhalika naye Kumwamba komweko.\n"),
           new Hymns(180,"180 Mbuye Ndapapanga ","1.\tMbuye, ndapangana m ‘njira yanuyi, Kuti ndizayenda osaleka’i. Mundipatse mtima wopiriramo, Wakukana zinse zondipingazo.\n" +
                   "\n" +
                   "2.\tMzimu wakuipa undiyesa’ne, Mundithangatire ku’thawitsabe, Akandisautsa kum’dzi kunoku, Mulowetse mphamvu m’mtima mwangamu.\n" +
                   "\n" +
                   "3.\tAkathira nsembe kumizimuyo, Ndipenyetse kwanu e, Kumwambako,\n" +
                   "Tsoka ndi zonyenga za ufitizo, Yesu, mndilimbitse, ndisaopezo.\n" +
                   "\n" +
                   "4.\tPena kumwa nawo, ndisateroko, Pena kukaona zakuvinazo; Pena kuombeza, sindifuna’I, Yesu, mndithandize kuzikanazi.\n" +
                   "\n" +
                   "5.\tNdinu Mbusa wanga, mndithandizetu, Ndisaipse nazo mtima wangawu;\n" +
                   "Osaopa konse, osachimwa ‘I, Mndiyendetse, Yesu, mnjira yanuyi.\n"),
           new Hymns(181,"181.Ku Maiko Onse (To the Regions Beyond)","1.\tKu maiko onse ndipite, ndipite, Komwe sikunalalikidwe; Kwa amene sanamve za chikondicho, Ndisimbe mbiri ya kaleyo.\n" +
                   "\n" +
                   "Ku maiko ena, ndipite, ndipite, Mpaka dziko lonse lipulumutsidwe.\n" +
                   "\n" +
                   "2.\tAndi’tana ndinke ku malo olimba, Osaganiza za zofewa; Dziko likanditcha wolota, wopusa; Koma Mbuye ndimkondweretse.\n" +
                   "\n" +
                   "3.\tInu akutaya nthawi ndi mphamvuzo, Pa zpzokondweretsa nokha, Dzukani mutaye mphulupulu zanu, Mupite ku maiko ena.\n" +
                   "\n" +
                   "4.\tKuli nkhosa zina Mbuye azifuna, Ziyenera kuuzidwanso; Wandituma monse ndizisonkhanitse, Zibwerenso mu khola lake.\n"),
           new Hymns(182,"Ndalandira Mtendere (My Wonderful Lord)","1.\tNdalandira mtendere watsopanotu, Ndi chimwemwe chosaneneka, Poti ndadzipereka thupi ndi mzimu, Kwa Mbuye wakudabwitsa.\n" +
                   "\n" +
                   "Ambuye wanga, wakudabwitsa, Angelo akulambirani m’Mwamba; Ndikugwadirani Mlanditsi wanga, Ambuye wakundidabwitsa.\n" +
                   "\n" +
                   "2.\tNdikhumbatu nditsogozedwe ndi Inu, Ndi kuti chifuniro changa, Chilinganetu ndi chifuniro chanu, Ambuye wakudabwitsa.\n" +
                   "\n" +
                   "3.\tLuntha lnga lonse ndipatsa kwa Inu, Mphotho yanga ndi nkhope yanu, Pakusauka ine ndidzipereka, Kwa Mbuye wakudabwitsa.\n" +
                   "\n" +
                   "4.\tMuli wokongolatu koposa onse, Inu ndinu Mawu amoyo, Muli Wakaleyo ndi Wopambanatu, Ambuye wakudabwitsa.\n" +
                   "\n"),
           new Hymns(183,"183.Pa Phiri la Kalvari ","\n" +
                   "1.\tPa phiri la Kalvari, dipo lalipidwa, Pomwe chiyembekezo chinafikira,\n" +
                   "\n" +
                   "Ndina mtsinje wa mwazi, wotsika Kalvari, Mafunde ochoka Mwamba akunditsirira.\n" +
                   "\n" +
                   "2.\tKulibe kutsutsidwa kwa kundiingitsa, Ku chipulumutso’cho – Ali m’mtima mwanga.\n" +
                   "\n" +
                   "3.\tNgati ndigwa m’chisoni, pena kuda mtima, Ndiyang’ana kwa Yesu,  adzandithandiza.\n" +
                   "\n" +
                   "4.\tPofika ku chipata chakumuyayawo, Oera woomboledwa adzayimbira.\n"),
           new Hymns(184,"184.Yafika Mumtima Mwanga ","1.\tYafika mu mtima mwanga, Ndi nyimbo ya chikondwero; Ndibwerezanso kuiyimba;\n" +
                   "Mtendere, mphatso ya Mlungu\n" +
                   "\n" +
                   "Mte-nde-re-wo, Mphatso yodabwitsayo, Mtendere wodabwitsatu, Mtendere, mphatso ya Mlungu.\n" +
                   "\n" +
                   "2.\tKhristu wachita mtendere, Ngongole inalipidwa, Kulibe maziko enanso,\n" +
                   "Mtendere, mphatso ya Mlungu.\n" +
                   "\n" +
                   "3.\tYesu ndi Mbuye wanga, Mtendere wandifikira; Mwa Iye ndkhala wodala,\n" +
                   "Mtendere, mphatso ya Mlungu.\n" +
                   "\n"),
           new Hymns(185,"185.Nchodala Chimango Chathu (Blessed Be thee)","1.\tNchodala chimango chathu, Cha m’chikondi chachikhristu, Ch’yanjano chokhala amtima umodzi, Nchonga chija Kumwamba.\n" +
                   "\n" +
                   "2.\tPa Mpando wa Tate wathu, Tipemphe ndi mtima wonse, Zoopsa, zolinga, ndi ziyembekezo, Ndi nkhawa ziri chimodzi.\n" +
                   "\n" +
                   "3.\tPamene titsazikana, Pamvetsa chisoni m’kati, Koamabe tikhala pamodzi mumtima,\n" +
                   "Tilinga tionananso.\n"),
           new Hymns(186,"186.Mtame Mulungu ","1.\tMtame Mlungu wa madalo, Mtame anthu pansi pano, Mtame, khamu la Kumwamba, Tate, Mwana Mzim’ Woyera."),
           new Hymns(187,"187.Oona Mu Mtima ","1.\tOona mu mtima, ‘dzina mokondwera, Tiyeni, tiyenitu ku Betlehemu;\n" +
                   "Modyera ng’ombe muli Mfumu yathu, Tiyeni timgwadire  (x3)\n" +
                   "Khristuyo.\n" +
                   "\n" +
                   "2.\tMulungu wamkulu wakuyerayera, Kubadwa mwa mkazi sanakana’I;\n" +
                   "Mwana wa ‘tate, sanalengedwadi; Tiyeni tingwadire (x3)\n" +
                   "Khristuyo.\n" +
                   "\n" +
                   "3.\tAngelo kwezani nyimbo zanu zonse, M’mwambamo mumveke zoyamikazo;\n" +
                   "Lemekezani Mlungu wakumwamba; Tiyeni timgwadire (x3)\n" +
                   "Khristuyo.\n" +
                   "\n" +
                   "4.\tM’dzikomo Ambuye Mnabadwira ife, Ulemu wosatha muyeneradi;\n" +
                   "Mawu a ‘Tate Munalowa m’thupi; Tiyeni timgwadire (x3)\n" +
                   "Khristuyo.\n"),
           new Hymns(188,"188.Chikondwerero Pa Dzikoli (Joy to the World)","1.\tChikondwero pa dzikoli, Wadza Mfumu yathu, Mitima yonse imkonzere malo,\n" +
                   "Zolengedwa ziyimbe (x2)\n" +
                   "Zolengedwa, zolengedwa ziyimbe.\n" +
                   "\n" +
                   "2.\tChikondwero, Alamula; Anthu amyimbire; Mapiri, nyanja, mina ndi madambo\n" +
                   "Zibwezere mawuwo (x2)\n" +
                   "Zibwezere, zibwezere mawuwo.\n" +
                   "\n" +
                   "3.\tUchimowo usakule, Minga isalase; Wabwera Yesu ndi mdalitso wake,\n" +
                   "Nachotsa temberero (x2)\n" +
                   "Nachotsa, nachotsa temberero.\n" +
                   "\n" +
                   "4.\tAlamula mwa chisomo, Naonetsa dziko; Ulemu ndipo chilungamo chake,\n" +
                   "Chikondi chodabwitsa (x2)\n" +
                   "Chikondi, chikondi chodabwitsa.\n" +
                   "\n"),
           new Hymns(189,"189.Mudze Iwe Wa Betlehemu (O Little Town of Bethlem)","1.\tMudzi iwe wa Batlehemu, uli mu tulo phe! Pamwamba pako nyenyezi zikupitirira;\n" +
                   "Koma mu msewu mwako muwala kuunika, Chiyembekezo chonse mwa iwe chadzazidwa.\n" +
                   "\n" +
                   "2.\tKhristu wobadwa m`Mariya za m`Mwamba nasonkha; M`mene ofooka agona angelo alonda, Nyenyezi ya kum`mawa, bukitsa mbiriyo! Yimbo zomthokoza Mfumu, mtendere padziko.\n" +
                   "\n" +
                   "3.\tKachetechete mphatso yaperekedwa phe, Mommo Mulungu apereka madalitso ake;\n" +
                   "Khutu silingamvetu kubwera kwakeko, Mwa omlandira mofatsa Khristu alowamo.\n" +
                   "\n" +
                   "4.\tInu Mwana wa Betlehemu, tsikani pa ife, Chotsani tchimo lathuli, mwa ife mubadwe; Atiuza angelo Uthenga Wabwino, Bweranitu, khalanimu, Mbuye Imanueli!\n" +
                   "\n"),
           new Hymns(190,"190. Usiko Woyerawo (Silent Night)","1.\tUsikuwo woywrawo! Mwana adamlerayo, Akakhale Mfumuyo, Anabadwa m’kholamo, Mfumu ya mafumu bdu ya anthuwo.\n" +
                   "\n" +
                   "2.\tMwana yo wa Mulunguyo, Andikonda unetu, Nanditayira chumacho nadzagona m’udzumo; Ndiyamika Mbuye wanga Yesuyo.\n" +
                   "\n" +
                   "3.\tUsikuwo woyerawo! Wadzatu mtenderewo; Ife tonse anthuwo atitenga Mulunguyo;\n" +
                   "Mlemekeze ‘Tate, Mwana, Mzimunso\n"),
           new Hymns(191,"191.Amithenga  A Mulungu(Hark the Herald Angels Sing","1.\tAmithenga a Mulungu anayimba nyimbo yomwe, Posonkhana m’mlengalenga, natitu usiku womwe; ‘Onse azilemekeza Mlungu wakumwambamwamba; Akhalebe nfi mtendere anthu ali ponseponse.’ Amithenga anayimba ndi usiku m’mlengalenga.\n" +
                   "\n" +
                   "2.\tAnanmva abusa omwe anaweta nkhosa zawo; Mthenga nati, ‘Musaope, mumve ndi kufotokoza; Wabadwa usiku uno Yesu Khristu Ambuyathu, Ndiye Mpulumutsi wathu; anabadwa m’Betlehemu.’ Amithenga anayimba ndi usiku m’mlengalenga.\n" +
                   "\n" +
                   "3.\tYesu ndinu Mbuye wathu, munasiya zakumwamba; Munakhala mwana kuno; m’natifera mwaufulu; Inu nonse amithenga, inu mumtsamande Iye; Anthu onse ali pansi adze akondane naye.  Zoonazi amithenga anayimba m’mlengalenga.\n"),
           new Hymns(192,"192. Mu Khola La Ng'ombe (Away in a Menger","1.\tMu khola la ng’ombe mu Betlehemu, Anabadwa Mbuyanga, dzina kale Yesu,\n" +
                   "Posowa chogonera Amayi wakeyo, Mu modyera mwa ng’ombe namgonetsemo.\n" +
                   "\n" +
                   "2.\tNg’ombezo zinalira koma kamwanako, Kanagonabe chete m’tulo take bwino;\n" +
                   "Nyenyezi za kumwamba zinampenyetsa ‘Ye, Yesu Khristu mwanayo sanalira konse.\n" +
                   "\n" +
                   "3.\tNdikukondani Yesu, mukhale m’fupitu, Mundikonde, mundigwire, mundisungiretu, Mwadalitse ana onse apadziko lino, Tikonzetse, tilowetse m’dzikola Mwambamo.\n" +
                   "\n"),
           new Hymns(193,"Kale M'Mzinda Wa Chifumu (One in David's Royal City)","1.\tKale m’zinda wa chifumu munalimo m’kholamo, Momwe mkazi anaika Mwana wake m’ndyelomo; Ndiye mkaziyo Mariya, Yesu Khristu Mwanayo.\n" +
                   "\n" +
                   "2.\tUyu ‘natsikira kuno, Mlungu Mbuye wathuyo; Anabadwa uyu m’khola, Anagona m’ndyelomo; Mwa osowa ndi oipa Yesu anakhalamo.\n" +
                   "\n" +
                   "3.\tMwa ubwana wake wonse anakula m’mtima phe! Anakonda, anafatsa, amayi wake namvabe; Ndipo ana nonse’nu Mukamtsate bwinotu.\n" +
                   "\n" +
                   "4.\tNdipo Mwana uyu Yesu anakulakulako, Ndi wang’ono ndi wofooka, Anangonga enawo; Nsoni zathu anazimva ndi chimwemwe chathunso.\n" +
                   "\n" +
                   "5.\tNdi chifukwa atikonda, tidzampenya masotu, Kuti Mwanayo wofatsa ndiye Mwini m’mwambamo; Atengera ana ake komwe anapitako.\n" +
                   "\n" +
                   "6.\tKoma sitimpenya m’khola muli ng’ombe momwemo; Iyayi, tidzamuona m’Mwamba muli M’lungu ‘Tatewo; Ana akuyera mbu adzamzunguliratu.\n"),
           new Hymns(194,"194.Wosimbayo Woyamba (The First Noel)","\n" +
                   "1.\tWosimbayo wyamba ndi mngelo wonena, Kwa abusa ofatsa ogona mthengo\n" +
                   "Ogona mthengo, nalonda nkhosazo, Usiku wozizira ndi wa mdima bi.\n" +
                   "\n" +
                   "Noel, Noel, Noel, Noel. Wabadwa Mfumu ya Israel\n" +
                   "\n" +
                   "2.\tAnzeru anatsogozedwa ni nyenyezi, Anachoka kummawa kuli kutali;\n" +
                   "Cholinga chawo ndicho, anafuna Mfumu, Natsatira nyenyezi uko ndi uko.\n" +
                   "\n" +
                   "3.\tNyenyezi inayenda mpaka ku mazdzulo, Niimira pamudzi wa Betlehemu,\n" +
                   "Penipeni pamalo pomwe anabadwa, Mbuye Yesuyo ali mana wakhanda.\n" +
                   "\n"),
           new Hymns(195,"195.Bayeti Nkosi Imanueli (All Hail Immanuel)","1.\tBayeti Nkosi Imanueli! Tilambire Mfumuyo Mitima yonse imvere, ndionse amutame, Poyimbira Kumwambako, malowe ake anyimbo, Ndi mphamvu abweza mawuwa, Bayeti! Bayeti! Bayeti! Bayeti! Imanueli!\n" +
                   "\n" +
                   "Dumisani Nkosi yathu, Bayeti Imanueli! Dumisani Nkosi yathu, Bayeti Imanueli!\n" +
                   "Ulemerero ndi ukulu, Nzeru ndi mphamvu ndi zanutu, Ku nthawi za nthawi,\n" +
                   "Dumisani Nkosi yathu, Bayeti Imanueli! Dumisani Nkosi yathu, Bayeti Imanueli!\n" +
                   "Mfumu tu ya mafumu! Bayeti Imanueli!\n" +
                   "\n" +
                   "2.\tBayeti Nkosi Imanueli! Khamu la omboledwa, Ndi mafumu am’dzikoli amuveke korona; Omboledwa akalewo posonkhana pa Mpandowo, Ayimba mosefukira,\n" +
                   "Bayeti! Bayeti! Bayeti! Bayeti! Imanueli!\n" +
                   "\n" +
                   "3.\tBayeti Nkosi Imanueli! Mfumu youkitsidwa; Adani ake agonja, mphamvu yake njosatha; Silamuliranso imfa, yaswa mphamvu ya Satana; Dzina lake likwezedwe,\n" +
                   "Bayeti! Bayeti! Bayeti! Bayeti! Imanueli\n"),
           new Hymns(196,"196.Dzuka Dzuka (Awekening Chorus)","Dzuka! Dzuka! Tiimbe nkhani yodala, Dzuka! Dzuka! Imveke nyimbo yotamanga,\n" +
                   "Dzuka! Dzuka! Kwacha padziko lonse,  Koti mbe, kuwala kwadzadza thambo lonse.\n" +
                   "\n" +
                   "Bass:\n" +
                   "Mapiri ndi zidikha, ziomba ndi kukondwera, Padziko lonse pali chigonjetso.\n" +
                   "\n" +
                   "Onse:\n" +
                   "\n" +
                   "Ambuye Yesuyo wakantha uchimo;  Kondwa! Kweza mtima wako kwa Yehova;\n" +
                   "Bukitsani ufumu wamphamvu! Ndi mbendera (yake) ifutukulidwe, Yesu Mfumu (Bass:\n" +
                   "Yesu Mfumu, Yesu Mfumu). Kondwa! Kondwa! Kondwa! Yesu Mfumu!\n" +
                   "\n" +
                   "2.\tOmba! Omba zitsulo za chimwemwe! Bweza! Bweza! Bwezanso nkhani yodala!\n" +
                   "Mpaka dziko litayatu chisoni, Liyimbe kwatsopano nyimbo yokoma.\n" +
                   "Bass:\n" +
                   "Ndi angelo am’mwamba ati chipulumutso, Yesu analanda m’dzanja la imfa.\n" +
                   "\n"),
           new Hymns(197,"197.Ndinali Ndekha Panjira (Follow Me)","1.\tNdinali ndekha panjira wosasamalidwa, Katunduyo wa pamsana ndinathodwa naye, Podandaulira zonse nsautso zangazo, Ndinamva mawu a Yesu okoma:\n" +
                   "“Inenso ndinalema m`njira ya Kalvari, Mtanda unalemera ndinagwa nawo pansi,\n" +
                   "Limbika woyendawe, kucha posachedwa, Senza mtanda wako, unditsate.”\n" +
                   "\n" +
                   "2.\tMwina ndimanyadirat utumiki wanga, Ndi nsembe zanga za panjira yopapatiza,\n" +
                   "Nditi ndataya chuma chifukwa cha Yesu, Tsono amati mawu okomatu;\n" +
                   "“Ndinatayatu Mpando wa Ulemerero, Manj’anga anakhoma pamtanda wankhanza,\n" +
                   "Tero m’ulendo wathu tigwirane manja, Senza mtanda wako, unditsate.”\n" +
                   "\n" +
                   "3.\tPakulipira ngongole ya chikondi chake, Ndipita ku dziko lina ndi kufera pompo;\n" +
                   "“Chikondi chachikulu pakufera bwenzi,” Awa ndi mawu a Yesu okoma,\n"),
           new Hymns(198,"198.Ndikhumba Mililime Chikwi (O for a Thousand Toungues)","1.\tNdikhumba malilime chikwi oyimbira, Zomtama Mombolo, zomtama Mombolo,\n" +
                   "Ndi ulemerero wa Mlungu wanga, Mphamvu za chisomo (x4)\n" +
                   "\n" +
                   "2.\tMbuye wa chisomo ndi Mulungu wanga, Mundithangatire, mundithangatire,\n" +
                   "Kuti ndibukitse padziko linseli, Dzinali la Yesu (x4)\n" +
                   "\n" +
                   "3.\tYesu ndi dzina limachotsa mantha, Lichotsa zisoni, lichotsa zisoni,\n" +
                   "Limvetsa nyimbo mkhutu la wochimwa, Nlamoyo, mtendere (x4)\n" +
                   "\n" +
                   "4.\tAmathyola mphamvu zonse za uchimo, Nasamala m’ndende, namasula m’ndende,\n" +
                   "Mwazi wake umasambitsa wochimwa, Unandikwanira (x4)\n" +
                   "\n"),
           new Hymns(199,"199. Chikhulupiriro Chanu Atate (Great is thy Faithfulness)","1.\tChikhulupiriko chanu Atate, Mulibe mthunzi wotembenuka, Simusanduka, sizitha zifundo, Monga muli, mudzakhala m’yaya.\n" +
                   "\n" +
                   "Chikhulupiriko chanu nchachikulu, Tsiku ntsiku chimadza chifundo; Zosowa zanga mumazikwanitsa, Chikhulupiriko Mbuyo chanu.\n" +
                   "\n" +
                   "2.\tDzanja ndi chilimwe, nyengo ya masika, Dzuwa ndi mwezi ndi nyenyezizo,\n" +
                   "Zonsezi zimachitira umboni, Chikhulupiriko Mbuye chanu.\n" +
                   "\n" +
                   "3.\tChikhulupiriko, mtendere wanu, Kutsogozedwa ndi nkhope yanu,\n" +
                   "Mphamvu ndi chiyembekezo cha mawa, Madalo onsewo ali anga.\n"),
           new Hymns(200,"200.Sindidziwatu Za Mawa (I know Who Holds Tomorrow)","1.\tSindidziwatu za mawa, ndiyenda tsiku ntsiku; Sindifuna nyali yake, poti mwina idzada; Za mawa sindida nkhawa, kaamba ka Mawu a Yesu; Lero ndiyenda naye, Adziwa za mtsogolo.\n" +
                   "\n" +
                   "Zinthu zambiri za mawa nzosazindikirika, Koma Wosunga za m’mawa Amandigwira dzanja.\n" +
                   "\n" +
                   "2.\tMapazi anyezimira panjira ya Kumwamba, Katundu amapepuka, mitambo ilikutha;\n" +
                   "Mommo dzuwa limawala, kulibe misozi; M’tsinde la Uta - wa – Leza, pakuthera kwa Thambo.\n" +
                   "\n" +
                   "3.\tSindidziwatu za mawa, pena lidzera ‘mphawi, Koma Wodyetsa mbalame Ndiye Woyima nane, Nkana njira ndiyendapo ikadzera ku moto, Koma ali patsogolo, ndaphimbidwa m’Mwaziwo.\n"),
           new Hymns(201,"201. Kukacha Tsiku Louka (We Shall Rise)","1.\tKukacha tsiku louka, likalira lipenga, Ndzauka, ndzauka; Pomwepo oyera mtima adzabwera mokondwa, Ndzauka, ndzauka.\n" +
                   "\n" +
                   "Ndzauka, ndzauka, ndzauka, haleluya, Kukacha tsiku louka, nsinga za imfa ziduka,\n" +
                   "Ndzauka, ndzauka.\n" +
                   "\n" +
                   "2.\tKukacha tsiku louka tidzasonkhana konko, Ndzauka, ndzauka, Mmen’anzathu okondedwa tidzakomana nawo, Ndzauka, ndzauka.\n" +
                   "\n" +
                   "3.\tKukacha tsiku louka, ganizo lodalatu, Ndzauka, ndzauka; Ndidzamuona Mpulumutsi yemwe anandifera, Ndzauka, ndzauka.\n" +
                   "\n" +
                   "4.\tKukacha tsiku louka tidzamkomana mthambo, Ndzauka, ndzauka; Tidzakwatulidwa ndithu tinke kwathu kokoma, Ndzauka, ndzauka\n"),
           new Hymns(202,"202.Tifunafuna Wotayika (Seeking the Lost)","1.\tTifunafuna wotayikayo, Wolowelera pa mapiri, ‘Bwera kwa Ine, ‘ anati Yesu,\n" +
                   "Uthenga wake tifalitse.\n" +
                   "\n" +
                   "Tinke patali pamwamba pa phiri, Wolowerela tim’bweze kwathu, Mu kholamo la Mombolo wathu, Yesu Mwanawankhosa wophedwa.\n" +
                   "\n" +
                   "2.\tTifunafuna wotayikayo, Timusonyeze kwa Yesuyo, Wofooka mtima, ndo wolefuka,\n" +
                   "Tiwatsogoze ku moyoko.\n" +
                   "\n" +
                   "3.\tTiyende ulendo wa chifndo, Yesu amatitsogolera; Olaswa onse, akugwa omwe,\n" +
                   "Aone njira ya kwa Yesu.\n"),
           new Hymns(203,"Ndinali Wochimwa (A Little Talk with Jesus)","1.\tNdinali wochimwa, Yesu wandichiza, Kanyali ka kumwamba kanandidzaza,\n" +
                   "Chikondi chalowa, dzina lalembedwa, Pokambiranan ndi Yesu ndakonzedwa,\n" +
                   "\n" +
                   "Tiye tikambiranetu ndi Yesu, Timuuze zobvuta zonse, Adzamva kulira kwathu,\n" +
                   "Adzayankha msangatu,Pamene uyambatu kapemphero, Mtima wako udzayaka moto,\n" +
                   "Pakukambirana ndi yesu ukonzedwa.\n" +
                   "\n" +
                   "2.\tMwina njira yanga ili yolemetsa, Mtambo wa chikayiko ubisa dzuwa,\n" +
                   "Nkhumgu za machimo zimadzaza thambo, Pokambirana ndi Yesu zakonzedwa.\n" +
                   "\n" +
                   "3.\tMwina ndikayika, msozi m’maso mwanga, Yesu bwenzi langa amandisunga,\n" +
                   "Kwa Mlungu ndipempha, nkhawazo zithawa, Pokambirana ndi Yesu zakonzedwa.\n"),
           new Hymns(204,"204.Mbuye Wanga Ndikalingariratu(How Great Thou art)","1.\tMbuye wanga ndikalingiriratu, Za ntchito zonse za dzanja lanu, Nyenyezizo ndi mabingu ogunda, Mdziko lonse muli mphamvu zanu,\n" +
                   "\n" +
                   "Mzimu wanga uyimbira Mlungu, Ndimu wamkulukulutu; Mzimu wanga uyimbira Mlungu\n" +
                   "Ndimu wamkulukulutu.\n" +
                   "\n" +
                   "2.\tMukakhala m’mabingu ogunda, Pena kunong óneza mumphepo, Ndikaona nkhope yanu mumphezi, Pena m’Uta-wa-Leza m’mitambo.\n" +
                   "\n" +
                   "3.\tM’kuwala kwa ulemerero wanu, Ndisinkha za Mtanda wa Kalvari, Ndingolira ndi mtima wakusweka, Mbuye, munandikhetsera Mwazi.\n" +
                   "\n" +
                   "4.\tMukabwera Ambuye ndi mitambo, Kudzaitan mkwatibwi wanu, Mwa chimwemwe ndidzakakhala nanu, Mbuye, ndidzakwaniritsidwatu.\n"),
           new Hymns(205,"205.Mnjira Monse Ambuye(Each Step I take)","1.\tM’njira monse Ambuye atsogola, Aonetsa njira m’dzanja lake, Ndinong’oneza, “Ndiri kukukondani.” O, chimwemwe poyenda naye.\n" +
                   "\n" +
                   "M’njira monse amanditsogolera, Motsatizana amandikweza, Tsiku lina ulendo udzathera,\n" +
                   "M’njira monse ndiyandika kwathu.\n" +
                   "\n" +
                   "2.\tMwinanso chikhulupiriro changa, Chimachepa pali kundiopsa; Pomwepo ndiyang’ana kwa Ambuye, Ndipo amandilimbikitsa.\n" +
                   "\n" +
                   "3.\tNdimutsamira m’zondigwera zonse, M’dzanja lake muli moy’wosatha,\n" +
                   "Ali ndi chifungulo chotsegula, Njira ya kudziko la Mwamba.\n"),
           new Hymns(206,"206. Kale KhritsuWokongola (The Unveiled Christ)","1.\tKale Khristu wokongola anatibizidwira, Koma pakulawa infa, Anang’amba Chinsaru.\n" +
                   "\n" +
                   "Taona Munthu wa nsoni myang’aneni ali mbe, Suyu Mlanditsi wamphamvu, wong’ambitsa Chinsaru, Suyu Mlanditsi wamphamvu, wong’ambitsa Chinsaru.\n" +
                   "\n" +
                   "2.\tYesu ali ndi Atate, atetezera inu, Ndiye mlanditsi wamphamvu, Anang’amba Chinsaru.\n" +
                   "\n" +
                   "3.\tAngelo amweramire, anthu amyamiketu, Ndiye Mlanditsi wamphamvu, Anang’amba Chinsaru.\n" +
                   "\n" +
                   "4.\tChikondi chake nchosatha, nchakuya, nchachikulu, Yesu yekha ndo Wopatsa, Atang’amba Chinsaru.\n"),
           new Hymns(207,"Yesu Ndine Wofooka (Just closer)","1.\tYesu ndine wofooka, ndisunge ku zoipa, Ndidzakwaniritsidwa ndikayenda pafupi ndinu.\n" +
                   "\n" +
                   "Ndiyende mfupi ndinu, Mundilore Yesu ndithu; Ndiyende tsiku ndi tsiku, pafupi Mbuye pafupitu.\n" +
                   "\n" +
                   "2.\tPadziko la misampha, ndikaphunthwa panjira, Ndani andithandiza?  Nokhanu, Mbuye, nokhanu.\n" +
                   "\n" +
                   "3.\tUkatha moyo uno, nthawi siidzakhalanso, Ndioloke tsidyalo, ku ufumu wanuwo.\n"),
           new Hymns(208,"208.Yesu Wayenda Mchigwamu (This Lonesome Valley)","1.\tYesu wayenda m’chigwamu, wayendamu payekha; O, palibe wina womyendera, anayandama payekha.\n" +
                   "\n" +
                   "2.\tNdidziyenda mu chigwamu, ndidzayenda ndekha, O, palibe wina wond’yendera, ndidziyendamu pandekha.\n" +
                   "\n" +
                   "3.\tUziyenda mu chigwamu, udziyendamu wekha, O, palibe wina woyendera, udzayendamu pawekha\n"),
           new Hymns(209,"Yesu Anafa Pa Mtanda ","1.\tYesu anafa pa mtanda, kutiombola ifetu, Kuti tikhale ndi moyo, anafa opanda tchimo.\n" +
                   "\n" +
                   "Lira, lira, lira; lira lilatu koposa; Lira, lira, lira, kuti amve kudandaula.\n" +
                   "\n" +
                   "2.\tEna analikum’menya, ena analikum’jeda; Zonse anamva kuwawa, koma sanayankhe kanthu.\n" +
                   "\n" +
                   "3.\tPofika kwa mfumu Pilato, anapfuula mokweza; Nanena apachikidwe, indetu apachikidwe.\n" +
                   "\n" +
                   "4.\tNamveka chisoti chimanga, nanena tikuoneni; Inutu mfumu ya Ayuda, koma sanayankhe kanthu.\n" +
                   "\n"),
           new Hymns(210,"210.Dzukani Ana Chipulumutso (Song of the soldier)","1.\tDzukani ana’chipulumutso, okangamira Khristu, Kwelani, inu mtundu wamphamvu, Angalowe adaniwo.\n" +
                   "\n" +
                   "Yimbani nyimbo mwa mphamvu, Yimbani nyimbo mwa mphamvu, Ngati namondwe m’nyanja, M’mwazi wa Mombolo wathu, Tilakatu koposa.\n" +
                   "\n" +
                   "2.\tKalero oyera mtima omwe anachirimikatu, Onani, mbendera zawo zomwe, M’mwazi analakikatu.\n" +
                   "\n" +
                   "3.\tOsafa, sitikhala ndi mantha, Mwa Khristu muli moyo, Likacha tsiku loonekera,\n" +
                   "Tolowa m’ulemerero.\n" +
                   "\n" +
                   "4.\tPosachedwa tikam’imirira, Ambuye tidzamdziwa; Tilowa m’chimwemwe ndi m’kuunika, Yesne mphotho alandira.\n"),
           new Hymns(211,"211.Mukalemedwa Potumikila (He'll Understand)","1.\tMukalemedwa potumikira, Polalika za Mpulumutsiyo, Musafooke dziko likakana,\n" +
                   "Amamva nati “Wachita bwino.”\n" +
                   "\n" +
                   "O, ndikafika pakutha paulendo, M’mene nkhondo itagonjetsedwa, Ndidzasintha mtanda ndi korona, Amamva nati, “Wachita bwino.”\n" +
                   "\n" +
                   "2.\tUkayesa koma walephera, Manja alasidwa ndi ntchito, Senza mtanda ukomane naye, Amamva nati “Wachita bwino”.\n" +
                   "\n" +
                   "3.\tMoyo uno wantchito ukatha, Mukadzalandira mphothoyo, Pumulani wokhulupirika, Amamva nati “Wachita bwino.”\n" +
                   "\n"),
           new Hymns(212,"212.Anapachikidwa Pofera Zoipa (The Healer)","1.\tAnapachikidwa pofera zoipa, Wopatsa moyo ndiye, Ananyozedwa nakanidwa ndi anthu, Yesuyo wa Kalvari.\n" +
                   "\n" +
                   "Analaswa ndi tchimo lathu, Ndi mphulupulu watunduzidwa, M’mikwingwirima yake,\n" +
                   "Ife tachiritsidwa.\n" +
                   "\n" +
                   "2.\tAnalipa dipo pakukwapulidwa, Pa bwalo la Pilato, M’mazunzo akewo muli machiritso, Mchiritsi ndi wangayo.\n" +
                   "\n" +
                   "3.\tWakhate anadza nati kwa Ambuye, “Mungathe kundikonza,” Chikhulupiriro chake chinakwana, Ambuye anamkhudza.\n" +
                   "\n" +
                   "4.\tNdinadwala m’mtima, Anandichiritsa, Adzakuchiritsanso, Ali yemwe lero ndi kuntawi zonse.  Mchiritsiyo wa anthu.\n"),
           new Hymns(213,"213. Ambiri Tikondwera","1.\tAmbiri tikondwera mwa Yesu, Nanga inu, nanga inu?  Tapeza chipulumutso ndithu, Nanga inu, nanga inu?\n" +
                   "\n" +
                   "Masiku onse timakondwera, Pakumva mawu ake a Yesu, Olalikira tidzamumvera\n" +
                   "Nanga inu, nanga inu?\n" +
                   "\n" +
                   "2.\tIfe tiyembekezera Yesu, Nanga inu, nanga inu? Chimwemwecho chilli mumtimamu,\n" +
                   "Nanga inu, nanga inu?\n" +
                   "\n" +
                   "3.\tTitasokera tinabwerera, Nanga inu, nanga inu?  Tidziwa kuti ndiwo uchimo,\n" +
                   "Nanga inu, nanga inu?\n" +
                   "\n" +
                   "4.\tTinachoka munjira za imfa, Nanga inu, nanga inu?  Takopeka ndi Mawu a Yesu,\n" +
                   "Nanga inu, nanga inu?\n"),
           new Hymns(214 ,"Mumthunziwo","1.\tMumthunziwo wamphamvuwo Muli thandizo langa, Pakuti manj’ake\n" +
                   "Amandigwira dzanja.\n" +
                   "\n" +
                   "Ndibisike munthunzi wake, Wa Mfumu ya mafumu; Mundiphimbe ndi mapiko,\n" +
                   "Ndipume, ndipume m’mapikomo.\n" +
                   "\n" +
                   "\n" +
                   "2.\tMunthunziwo wamphamvuwo, Muli thandizo langa, Pakuti ndi maso ake\n" +
                   "Amandiyang ‘anira.\n" +
                   "\n" +
                   "3.\tMunthunziwo wamphamvuwo, Muli thandizo langa, Mafunde akafika\n" +
                   "Amandilimbikitsa.\n"),
           new Hymns(215,"215.Msokhano","1.\tKuli chimwemwe chosaneneka pa nthawiyo, Pamene Mbuye alinkubwera padzikoli;\n" +
                   "Kuli msonkhano waukuludi pa nthawiyo wakuposatu, Kwambirimbiri, wosiyanatu ndi anthuwa; Onatu, onatu, onatu ona! Alinkudza, alinkudzatu, kutenga akondedwa! Amen! Pamene anthu enawo sadzaona anthuwa, Adzanka kunja, kuli chimdima, pakhomo patsekedwa, Sadzalowamo, sadzalowamo, sadzalowamo ndithu! Sadzaona msonkhano.\n" +
                   "\n" +
                   "Msonkhano siambiri, msonkhano, msonkhano; Ona msonkhano, ona msonkhano, msonkhano;\n" +
                   "Msonkhano wakuyera.\n" +
                   "\n" +
                   "2.\tPanthawi ina Angelo aja ananena, “Mwaimiranji ndi kuyang’ana za Kumwamba?\n" +
                   "Ambuye wanu walandiridwa ndi mitambo; Monga mwamuona alikupita adzabweranso ndi mitambo.” Onatu, onatu, onatu ona! Alinkudza, alinkudzatu, kutenga okondedwa! Amen! Pamene anthu enawo sadzaona polowa, Adzanka kunja, kuli chimdima, pakhomo patsekedwa, Sadzalowamo, sadzalowamo, sadzalowamo ndithu! Sadzaona msonkhano.\n" +
                   "\n"),
           new Hymns(216,"216.Pa Mtanda Anafa Yesu ","1.\tPa Mtanda anafa Yesu, pakuthawirapo pathu; Ndichisomo chomwe chakwanira ine,\n" +
                   "Chiri chachikulu mongatu nyanja.\n" +
                   "\n" +
                   "Pa mtanda pali malo, pa Mtanda pali malo; Zikwi za anthu zadza komatu\n" +
                   "Pa Mtanda pali malo’nso.\n" +
                   "\n" +
                   "2.\tNgakhale anthu zikwizo, ampeza Yesu Bwenzi’lo, Adikirabe, Chipata chiri mbe!\n" +
                   "Alowa Wochimwayo kusanade.\n" +
                   "\n" +
                   "3.\tDzanja la Yesu nlamphamvu, Chikondi’cho nchachikulu, Dzuwa likawala, mvula ikavumba, Mwazi wa Kalvari umasambitsa.\n" +
                   "\n"),
           new Hymns(217,"217. Mtima wanga Uyimba (Until Then)","1.\tMtima wanga uyimba pokumbuka, Zowawazi ziri ngati mi’yala; Yopondera pa njira yakumwamba, Pansi pano sikwathu kosatha.\n" +
                   "\n" +
                   "Mpaka tsiku lija ndidzayimbabe, Ndi chimwemwe ndidzangopitira, Mpaka tsiku ndidzaona Mzindawo, Mpaka M’lungu andi’tana.\n" +
                   "\n" +
                   "2.\tZa pansipa ziri chizirezire, Popenyetsa mmene ziri kutha, Zochititsa mtima kunthunthumira, Uko zidzachita kumwetula.\n" +
                   "\n"),
           new Hymns(218,"Dzina Lodabwitsa (His name is Wonderful","Dzina lodabwitsa, Dzina lodabwitsa, Dzina lodabwitsa, Yesu Mbuye;\n" +
                   "Ndiye wauphungu, Mulungu wamphamvu, Dzina lodabwitsa, Yesu Mbuye.\n" +
                   "\n" +
                   "Atate wosatha, Karonga wa mtendere, Wolamula zonse, M’weramire Iye, M’konde m’lambire, Dzina lodabwitsa, Yesu Mbuye.\n" +
                   "\n"),
           new Hymns(219,"219 Oyerea Mbuye Dzinalo Lamphamvu(Holy is the Lord)","Oyera Mbuye dzinalo lamphamvu, Mfumuyo inatsikiratu, Angelo ndi anthu a m’yamiketu, Oyera Mbuye dzinalo lamphamvu.\n" +
                   "\n"),
           new Hymns(220,"220.Yesu ndi Dzina (Jesus is the Name)","Yesu ndi dzina, Yesu ndi dzina, Yesu ndi dzina la Mbuye, Yesu ndi dzina, Yesu ndi dzina, Yesu ndi dzina la Mbuye.\n" +
                   "\n" +
                   "Haleluya, Haleluya, Yesu ndi dzina la Mbuye, Haleluya, Haleluya,\n" +
                   "Yesu ndi dzina la Mbuye.\n"),
           new Hymns(221,"Tambasulani Dzanja (Reach Out and Touch the Lord)","Tambasulani dzanjamukhuze Mbuye, Iye satanganidwa akumvetsera,\n" +
                   "Pano akwaniritsa chomwe musowa, Tambasulani dzanja akupaza.\n"),
           new Hymns(222,"Ndam'mona Pa Kalvari(I see calvary)","Ndam’ona pa Kalvari, Ndam’ona pa Kalvari, Zoipa zangazo zachokamo,\n" +
                   "Ndam’ona pa Kalvari\n"),
           new Hymns(223,"Chete (Stand Still)","Chete dziwa ndine M’lungu, Chete dziwa ndine M’lungu,\n" +
                   "Chete dziwa ndine M’lungu,\n"),
           new Hymns(224 ,"Si Mphamvu (Not by Might)","1.\tSi mphamvu, si nkhondo, koma Mzimu wa Mbuye (x2) Mapiri asunthidwa (x3) ndi Mzimu wa Ambuye.\n" +
                   "\n" +
                   "2.\tSi mphamvu, si nkhondo, koma Mzimu wa Mbuye (x2) Machimo adzachoka (x3) ndi Mzimu wa Ambuye.\n" +
                   "\n" +
                   "\n" +
                   "3.\tSi mphamvu, si nkhondo, koma Mzimu wa Mbuye (x2) Yesuyo abatiza (x3) ndi\n" +
                   "Mzimu wa Ambuye\n" +
                   "\n" +
                   "4.\tSi mphamvu, si nkhondo, koma Mzimu wa Mbuye (x2) Yesuyo adzabwera (x3) ndi\n" +
                   "Mzimu wa Ambuye.\n"),
           new Hymns(225,"Anthu Onse Adziwe(Everybody Out to Know)","Anthu onse adziwe, anthu onse adziwe, Anthu onse adziwe, Yesu ali yani; (anso)\n" +
                   "Ndiye Kakombo wa m’zigwa ndi Nthanda yokomatu, Apambana anthu onse, anthu\n" +
                   "onse adziwe.\n" +
                   "\n"),
           new Hymns(226,"Halelu","Halelu, halelu, halelu, haleluya, Myamiken’. Halelu, halelu, halelu, haleluya,\n" +
                   "Myamiken’. Nyamiken Haleluya (3x) Nyamiken’.\n"),
           new Hymns(227,"227.Yesu Ndi Mpulumutsi (Jesus is the Only Saviour)","Yesu ndiye Mpulumutsi, mawu afalitsidwe, Yesu ndi Sing’anga ‘mkulu,  \n" +
                   "wochiritsa ndiye, \n" +
                   "Yesu ndi Mbatizi lero ndi Mzimu Woyera, Haleluya, Pfuulan’Ali Mfumu\n" +
                   "yakubwera.\n"),
           new Hymns(228,"228.Mu Bukhu Dzina Lina Lasowa(A name missing) ","Mu bukhu dzina lina lasowa, Mu bukhu dzina lina lasowa, Mu bukhu dzina lina\n" +
                   "lasowa, Kodi lanu lilipo?\n" +
                   "\n" +
                   "Kumwamba dzina lina lasowa, Kumwamba dzina lina lasowa, Kumwamba dzina lina lasowa, Kodi lanu lilipo?\n"),
           new Hymns(229,"229.Wachoka (Rolled Away)","Wachoka, wachoka, wachoka, Katundu wa mumtima wachoka; (anso) Zoipa zonse\n" +
                   "zachoka, Ndi Mwaziwo wa Nkhosa; Wachoka, wachika, wachoka, Katundu wa\n" +
                   "mumtima wachoka\n"),
           new Hymns(230,"230.Tumizani Mzimu Wanu (Send Your Holy Spirit)","Tumizani Mzimu wanu Ambuye, Tumizani Mzimu wanu Ambuye,\n" +
                   "Tumizani Mzimu wanu Ambuye, Tumizani Mzimuwo.\n" +
                   "\n" +
                   "5.\tAna anu afuna Inu Ambuye….\n" +
                   "\n" +
                   "6.\tIfe tonse tifuna Inu Ambuye\n"),
           new Hymns(231,"231.Ali Wodabwitsa(Isn't he Wonderful)","Ali Wodabwitsa, Yesu Mbuyathuyo, Ali Wodabwitsa, Yesuyo; Diso silinaona,\n" +
                   "Khutunso silinamva, Ali Wodabwitsa, Yesuyo.\n"),
           new Hymns(232,"232.Mtame(Praise Him)","Mtame, mtame, Nthawi ya mamawa, Nthawi ya masana, Mtame, mtame,\n" +
                   "Pamene dzuwa lilowa.\n" +
                   "\n" +
                   "Mtame, mtame, Nthawi ya madzulo, Nthawi ya usiku, Mtame, mtame,\n" +
                   "Pamene dzuwa lituluka\n" +
                   "\n" +
                   "CHITUMBUKA;\n" +
                   "Wonga, wonga, Nyengo ya mulenje, Nyengo ya muhanya; Wonga, wonga,\n" +
                   "Papo dazi linjira.\n" +
                   "\n" +
                   "ENGLISH\n" +
                   "Praise Him, praise Him, Praise Him in the morning, Praise Him in the noontime;\n" +
                   "Praise Him, praise Him, Praise Him when the sun goes down.\n"),
           new Hymns(233,"233.Tikambe Za Yesu","Tikambe za Yesu, Mfumu ya mafumu, Mbuye wa ambuye, ku nthawi za nthawi;\n" +
                   "Ndiye Njira, Moyo, Choonadi ndi Khomo, Tikambe za Yesu ponsepo.\n" +
                   "\n"),
           new Hymns(234,"Ndidzazeni Ndi Mzimu (Give Me Oil)","Ndidzazeni ndi Mzimu ndiwale, Ndidzazeni ndipempheratu, Ndidzazeni  ndi Mzimu\n" +
                   "ndiwale, Ndiwale Yesu.\n" +
                   "\n" +
                   "Yimba Hosana kwa Yesu, Hosana! Mfumu ya mafumu, Yimba Hosana kwa Yesu\n" +
                   "Mfumu ya mafumu!\n"),
           new Hymns(235,"Ndimsankhatu Yesu (I'll Take Jesus for Mine)","Ndimsankhatu Yesu, ndimsankhatu Yesu, Ena ‘sankha za mdziko, ndimsankhatu Yesu."),
           new Hymns(236,"236.Ndani Angadziwe (Who Can Know?)","Ndani angadziwe za pansi za mtima? (x3) Yesu Mwana wa Mulungu.\n" +
                   "\n" +
                   "Ndani angayende pa mwamba pa madzi? (x3) Yesu Mwana wa Mulungu.\n"),
           new Hymns(237,"Ena Ati (Some Think So)","Ena ati kaya, kapena nkotheka, Koma ndapulumutsidwa, Angoyembekeza adzanka\n" +
                   "Kumwamba, Koma ndapulumutsidwa; Ndinatsegula mtima kwa Mpulumutsi,\n" +
                   "Anchotsa machimo, nataya nsoni, Ndipo Mzumu yemwe amachita ‘mboni\n" +
                   "Kuti ndapulumutsidwa.\n"),
           new Hymns(238,"Talama ()Safe am I","Talama, talama, mu chikhato cha Mlungu; Vimbidwa, vimbidwaa ndi chikondi\n" +
                   "chosatha; Sindilasidwa, sindiopsedwa usana ndi usiku; Talama, talama, mu chikhato\n" +
                   "cha Mlungu.\n"),
           new Hymns(239,"239.Zili Pansi Pa Mwazi(Under the Blood)","Ziri pansi pa mwazi (x2) Ziri pansi pa mwazi wa Yesu; Zoipa zanga zonse\n" +
                   "Zachotsedwa mu mtima, Ziri pansi pa mwazi wa Yesu.\n"),
           new Hymns(240,"240.Ndinali Kutali (I was Far From The Cross)","Ndinali kutali ndi mtanda wa Yesu, Tsopano ndaupeza moyo, Ndaupeza moyo,\n" +
                   "ndaupeza moyo , Tsopano ndaupeza moyo.\n"),
           new Hymns(241,"241.Kuzani Mbuye Nane (Magnify the Lord with Me)","Kuzani Mbuye nane, Wofera pa Kalvari, Chisomo chaulere, kuzani Mbuya nane\n" +
                   "Kuzani Mbuye nane, Wofera pa Kalvari; Atigonjetseradi, O, kuzani Mbuye nane.\n"),
           new Hymns(242,"242.Ndikondwera (I'm So Happy)","Ndikondwera, nacho chifukwa; Yesu watula mtolo wanga, Tsono nyimbo\n" +
                   "ndirikuyimba, Yesu watula mtolo wanga, Kale ndinalemedwa ndi zoipa, Yesu\n" +
                   "wazichotsa nandipulumutsa, Tsono nyimbo ndirikuyimba, Yesu watula mtolo wanga.\n"),
           new Hymns(243,"Chuma Chodabwitsa (Wonderful Trasure)","Ndiri ndi chuma chodabwitsa, Mphatso yosayeseka; Tidzayenda pamodzi,\n" +
                   "Baibulo anga ndine.\n"),
           new Hymns(244,"244. Oyela Akalowa (When the Saints)","Oyera akalowa, oyera akalowa, Mbuye ndikhale mkati mwawo, Oyera akalowa."),
           new Hymns(245,"245.Chokondi Cha yesu(The Love of Jesus Christ)","Chikondi cha Yesu ndi chopambana zedi, Chikondi cha Yesu ndi chopambana. (anso)\n" +
                   "\n" +
                   "E! Taonani, Iye anafera pa mtanda, Taonani, chifukwa cha ife; E! Taonani, Iye anafera pa mtanda\n" +
                   "Chikondi cha Yesu ndi chopambana.\n" +
                   "\n" +
                   "Chikondi cha Yesu ndi chodabwitsa zedi, Chikondi cha Yesu ndi chodabwitsa (anso)\n"),
           new Hymns(246,"246.Moyo Wanga Wakale(My Old Life)","Moyo wanga wakale ndamupatsa Yesu (x3) \tHaleluya ndapulumutsidwa.\n" +
                   "Haleluya, Haleluya ndapulumutsidwa (x3) \tHaleluya ndapulumutsidwa.\n"),
           new Hymns(247,"247.Ambuye Yesu Akubwera (The Lord is Coming)","Moyo wanga wakale ndamupatsa Yesu (x3) \tHaleluya ndapulumutsidwa.\n" +
                   "Haleluya, Haleluya ndapulumutsidwa (x3) \tHaleluya ndapulumutsidwa.\n"),
           new Hymns(248,"258.Yesu Apitiratu(Jesus is Passing)","Yesu apitiriratu, njirayi, leroli, Yesu apitiriratu, Apitirira lero."),
           new Hymns(249,"249. Muli Phamvu (His Power)","Muli mphamvu, e, muli mphamvu, Muli mphamvu, m’mwazi wa Yesu"),
           new Hymns(250,"250.Dziko Losowa yesu (What the World Needs)","Dziko losowa Yesu, kungopenya ‘Ye, Dziko losowa Yesu, kungopenya ‘Ye,\n" +
                   "Apatsa chimwemwe, achotsa chisoni; Dziko losowa Yesu, kungopenya ‘Ye,\n" +
                   "\n" +
                   "\n"),
           new Hymns(251,"251.Tsata Ndikutsatani Ambuye","Tsata, ndikutsatani Mbuye, Tsata tsiku ndi tsiku;\n" +
                   "Za mawa nzodziwika ndinu, Mudzanditsogolera.\n"),
           new Hymns(252,"252. Ndidzalimbika (I'm Gonna Work)","Ndidzalimbika pa ntchito, Ndidzamdikira m’pempero,\n" +
                   "Ndiyembekeza nkhpe yake msangatu; Ndidzamvetsera Mawu Ake,\n" +
                   "Ndisankha kufuna kwake, Ndidzakomana naye posachedwa.\n"),
           new Hymns(253,"253. Dziki Silizandigwira (This Old World)","Dziko silidzandigwira, M’kamphindi ndidzachoka,\n" +
                   "Poti ndinadzipereka, Chovala chaukwati ndivala.\n"),
           new Hymns(254,"254.Pamene Nkhondo Yatha (When the battles Over )","Pamene Nkhondo yatha, Tidzavala korona (x3)\n" +
                   "Pamene Nkhondo yatha, Tidzavala korona, Mu dziko labwino\n" +
                   "Pamene Nkhondo yatha, Tidzavala korona, Mu dziko labwino.\n" +
                   "\n" +
                   "\n"),
           new Hymns(255,"255. Paulendo (Highway)","Ndiri paulendo, ndiri paulendo, ndiri paulendo, Mbuye wand’tana ndi navomereza;\n" +
                   "Ndiri paulendo, ndiri paulendo, ndiri paulendo, Sufuna kupita kwathu kwa ‘Tate?\n" +
                   "Ndiri pa ulendo.\n"),
           new Hymns(256,"256.Mulungu M'modzi ndi Mtetezi Modzi","Pakuti pali Mulungu mmodzi, Ndi mtetezi mmodzi; Pakati pa munthu ndi munthu,\n" +
                   "Ndiye munthu Khristu Yesu; Yemwe anadzipereka yekha, Chiombolotu m’malo mwa\n" +
                   "onse, Yemwe anadzipereka yekha, Mpulumutsi wodabwitsa.\n"),
           new Hymns(257,"257.Tikhoza Kukwera (We are Able to go up,)","Tikhozadi kukwera ndi kulandira, Dziko lonse kufikira ku nyanja,\n" +
                   "Zingakhale zitiletsa ndi ziwinda, Mulungu atigonjetsera.\n"),
           new Hymns(258,"258.Chipembedzo Chakale","Chipembedzo chakale (x3) Chiri bwino kwa ine.\n" +
                   "\n" +
                   "-\tChipembedzo cha Petro\n" +
                   "-\tChipembedzo cha Paulo\n" +
                   "-\tChimapatsa chikondano\n" +
                   "-\tChidzatitenga Kumwamba.\n"),
           new Hymns(259,"259.Ndidziwa Nbuye","Ndidziwa  Mbuye andikonzera njira, Ndidziwa  Mbuye andikonzera njira,\n" +
                   "Ndikhala woyera ndikukana zoipa.  Ndidziwa  Mbuye andikonzera njira.\n"),
           new Hymns(260,"260.Akupyoletsa M'mayeso (He'll Take You Thru)","Akupyoletsa m’mayeso onse, Samamana chikondi chake; khulupira malonjezano,\n" +
                   "Akupyoletsa, akupyoletsa.\n" +
                   "\n"),
           new Hymns(261,"261.Undipumire (Let it Breathe on Me)","Undipumire, undipumire, Mpweya wa Mlungu undipumire;\n" +
                   "Undipumire, undipumire, Mpweya wa Mlungu undipumire.\n" +
                   "\n"),
           new Hymns(262,"262.M'mtima Mwanga (Into My heart)","M’mtima mwanga, m’mtima mwanga; Lowani m’mtima mwanga Yesu;\n" +
                   "Lowan’ lero, mukhalemu, Lowani m’mtima’nga Yesu.\n" +
                   "\n"),
           new Hymns(263,"263.Nditsata Yesu (Following Jesus)","Nditsata Yesu tsiku ndi tsiku, Sindidzaona, atsogolera; M’dzuwa ndi m’mthunzi;\n" +
                   "Mzovuta zotani, Yesu Mpulumutsi ali nane.\n" +
                   "\n"),
           new Hymns(264,"264.Mitsinje yosaolokeka (Got any Rivers)","Pali mitsinje yosaolokeka?  Pali mapiri osapyoleka?  Zosathekazo zitheka ndi Mulungu,\n" +
                   "Angachite ena akalephera.\n"),
           new Hymns(265,"265.Sichilephera (Never Failed Me Yet)","Sichilephera, sichilephera, Chikondi cha Mbuye wanga, Ichi ndidziwa konse ndipita,\n" +
                   "Chikondi sichilephera.\n"),
           new Hymns(266,"266.Pempehera (Whisper a Prayer)","Pemphera nthawi ya m’mawa, Pemphera nthawi ys usana, Pemphera nthawi ya usiku,\n" +
                   "Ukonzeke m’mtimamo.\n" +
                   "\n" +
                   "Ayankha Mbuye mamawa, Angadze Mbuye mamawa.\n"),
           new Hymns(267,"Mwand'tana (When He Calls Me)","Mwandi’tana ndavomera (3x) Ndidzakutumikirani Ambuye.\n" +
                   "\n" +
                   "Ndidzakutumikirani, ndidzakutumikirani, Ndidzakutumukirani Ambuye (anso).\n" +
                   "\n" +
                   "M’midzi yonse ndidzayenda (3x)\n" +
                   "Kuli konse ndidzayenda (3x)\n" +
                   "\n"),
           new Hymns(268,"268.Ndifuna Yesu (I need Jesus)","Ndimufuna, ndimufuna, ndimufuna Yesuyo; M’mene dzuwa liwala, m’mene mphepo iomba, Nthawi zonse zamoyo, ndimufuna."),
           new Hymns(269,"269.Kukongola Ndionetse (Let the Beauty)","Kukongola kwa Yesu ndionetse, Chikondi chodabwitsa ndi chiyero,\n" +
                   "Mzimu Woyera’nu ndisambitseni mbu, Kukongola kwa Yesu ndionetse.\n" +
                   "\n" +
                   "\n"),
           new Hymns(270,"Ndidzipereke (I want to Live So)","Ndidzipereke kuti Mbuye, Anditume pansepo; (anso)\n" +
                   "\n" +
                   "Ndidzipereke kuti Mbuye, Andimvetse ponsepo.\n" +
                   "\n" +
                   "Ndikonzekere kuti Mbuye, Anditenge Kumwamba.\n" +
                   "\n"),
           new Hymns(271,"271.Mkangowow Wa Yuda (The Lin of Judah)","Mkangowo wa Yuda udzadula unyolo, Atipatsa chigonjetso nthawi ndi nthawi (anso)"),
           new Hymns(272,"272.Mongatu Yesu (To Be Like Jesus)","Mongatu Yesu, mongatu Yesu, Ndikhale monga Iye; M’ulendo wonse mpaka\n" +
                   "Kumwamba, Ndikhale monga Iye.\n"),
           new Hymns(273,"273. Chikondi Cha yesu (The Love Of Jesus)","Chikondi cha Yesu nchodabwitsa, Nchodabwitsa, nchodabwitsa,\n" +
                   "Chikondi cha Yesu nchodabwitsa, Nchodabwitsa ndithu.\n"),
           new Hymns(274,"274.Yesu mpatali (Jesus is Great)","Yesu mpatali, Yesu mpatali Ha! Haleluya! (x2) Yesu ndi moyo, Yesu ndi moyo ha! Haleluya! (x2) Yesu ndi njira, Yesu ndi njira ha! Haleluya! (x2)"),
           new Hymns(275,"275.Ndimkonda (I love Him)","Ndimkonda, ndimkonda, ndimkonda koposa, Ndimkonda, ndimkonda, ndimkonda koposa."),
           new Hymns(276,"276.Ndisungeni (Keep Me True)","Ndisungeni Yesu ndisungeni, Ndisungeni Yesu ndisungeni, Ndithamange liwiro,\n" +
                   "Ndichite chigonjetso, \tNdikhale wa mphamvu ndisungeni\n"),
           new Hymns(277,"277.Zikomo Ambuye (Thank You Lord)","Zikomo Ambuye wanga, zikomo mwandichiritsa; Zikomo mwandipatsatu\n" +
                   "chipulumutso chachikulu;\n"),
           new Hymns(278,"278.Mlungu Analikonda Dziko (For God So Loved the World)","Mlungu analikonda dziko kotere, Wapatsa Mwana’ke adzatifere’fe,\n" +
                   "Tsiku lina abwera m’ulemerero, Chikondi chachikulu.\n"),
           new Hymns(279,"279.Yesu Amadula Unyolo (Jesus Breaks Every Fetter)","Yesu amadula unyolo, Yesu amadula unyolo, Yesu amadula unyolo, nandimasua."),
           new Hymns(280,"280.Musanthule Mbuye (Search Me O God)","Musanthule Mbuye m’mtima mwanga, Ndi ndingaliro zanga muziyese,\n" +
                   "Mupenyemu zopa zangazi, Mundisambitse mundimasule.\n" +
                   "\n" +
                   "Mzim’Woyera mutitsitsimutse, Muyambe mwanditsutsa ine, Chosowa changa\n" +
                   "muchikwaniritse, Madalo an Mbuye ndipempha.\n"),
           new Hymns(281,"281.Ndifunitsa Kumtsatira Yesu (I Want to Follow Jesus)","Ndifunitsa, kumtsatira Yesu, Ndifunitsa, kuyenda naye, Ndifunitsa, kumtsatira Yesu,\n" +
                   "Konse ayenda, ndimtsatira.\n" +
                   "\n" +
                   "Mdimtsatira, ndimtsatira Yesu, Ndimtsatira poyenda naye, Ndmtsatira, ndimtsatira Yesu, Konse ayenda, ndimtsatira.\n" +
                   "\n"),
           new Hymns(282,"282.Yesuyo Adzabwera (Jesus is Coming)","Yesu adzabwera (x3) \tTsiku lina adzabwera."),
           new Hymns(283,"283.Tsikuli Ndi Yesu (Everyday with Jesus)","Tsikuli ndi Yesu nlokoma kopsa lina, Tsikuli ndi Yesu, ndimkonda koposa,\n" +
                   "Wandipulumutsa ndi yemweyo ndimlindira; Tsikuli ndi Yesu, nlokoma koposa lina.\n"),
           new Hymns(284,"284.Timlemekezetu Yesu (We'll Give Glory to Jesus )","Timlemekezetu Yesu, Ndi kusimbira chikondi chake, Timlemekezetu Yesu,\n" +
                   "Chikondi chodabwitsacho.\n"),
           new Hymns(285,"285.Adzayenda Ngati Mtsinje (He Shall flow Like a River)","Adzayenda ngati mtsinje, Adzagwa ngati mvula, Adzawala ponsepo,\n" +
                   "Ngati dzuwa mamawa; Chidziwitso cha Mbuye, Chibukitsidwa monse\n" +
                   "Ndimo Mzimu wake udzagwa.\n"),
           new Hymns(286,"286.Mlungu Ali Bwino (God is so Good)","Mulungu ali bwino (x3) Ali bwino kwa ine."),
           new Hymns(287,"287.Mdimtsatira Yesu (I'm Following Jesus)","Ndimtsatira Yesu phazi ndi phazi, Chkwanira lero chikondi chake\n" +
                   "Sindidera nkhawa ndi zamawa bii, Ndimtsatira Yesu phazi ndi phazi\n" +
                   "\n" +
                   "Pa yopapatiza anditsogola, Mu mnthunzi wakewo mantha achoka;\n" +
                   "Ndilimbikitsidwa tsiku lonseli, Potsatira Yesu phazi ndi phazi.\n"),
           new Hymns(288,"288.Ambuye Amalambula Njira (The lord makes a Way)","Ambuye amalambula njira, Ine ndizingotsatira, Njira alambula mçhipululu,\n" +
                   "Ine ndizingotsatira; Mphamvu lero ndi mamawanso, Zosowa amakwaniritsa,\n" +
                   "Ambuye amalambula njira, Ine ndizingotsatira.\n"),
           new Hymns(289,"289.Khulupira (Only Believe)","Khulupira, khulupira, Zonse zitheka, khulupira (anso)\n" +
                   "\n" +
                   "Only believe, only believe, All things are possible, Only believe.\n"),
           new Hymns(290,"290.Ine Ndine Kuuka (I am Resurrection)","Ine ndine kuuka ndi moyo, Iye wokhulupira, wakufa, Adzakhala ndi moyotu,\n" +
                   "Wokhala ndi moyo nandikhulupirira, Ndithu sadzamwalira.\n"),
           new Hymns(291,"291.Tchimo Langa Lonse Lachotsedwa (All of My Burdens)","Tchimo langa lonse lachotsedwa, Lachotsedwa, lachotsedwa,\n" +
                   "Tchimo langa lonse lachotsedwa, Pa mtandapo.\n" +
                   "\n" +
                   "Chimwemwe chalowa m’mtima mwanga, M’mtima mwanga, m’mtima mwanga;\n" +
                   "Chimwemwe chalowa m’mtima mwanga, Pa mtandapo.\n" +
                   "\n" +
                   "Mtendre walowa m’mtima mwanga, M’mtima mwanga, m’mtima mwanga;\n" +
                   "Mtendere walowa m’mtima mwanga, Pa mtandapo.\n" +
                   "\n" +
                   "\n"),
           new Hymns(292,"292.Mzimu Wa Mulungu (Spirit of the Living God)","Mzimu wa Mulungu’nu, mundigwere, Mzimu wa Mulungu’nu, mundigwere\n" +
                   "Ndiumbeni, ndidzazeni; Mzimu wa Mulungu’nu, mundigwere\n"),
           new Hymns(293,"293.Mwaziowo Wa Yesu (Oh the Blood jesus)","Mwaziwo wa Yesu, Mwaziwo wa Yesu; Mwaziwo wa Yesu, wandisambitsa mbu."),
           new Hymns(294,"294.Ndipereka Zanga zonse (I Surrender All)","1.\tNdipereka zanga zonse mwaufulu kwa Yesu, Ndidzamkonda kopambana, tsiku liri lonsetu.\n" +
                   "\n" +
                   "Ndipereka zonse kwa Yesu; Ndipereka zonse kwa’Nu, dalitsenitu.\n" +
                   "\n" +
                   "2.\tNdipereka zanga zonse pa mapazi a Yesu; Zapadziko ndazikana, nditengeni Yesu ‘Nu.\n" +
                   "\n" +
                   "3.\tNdipereka zanga zonse, ndipo n’khale wanutu; Mzimu wanu ‘ndidziwitse kuti ndine wanudi.\n" +
                   "\n"),
           new Hymns(295,"295.Ndife Christ's Ambassadors (Christ Ambassadors)","Ndife Christ’s Ambassadors, Mbenderayo tikweze njo; Tikhale oyera mbu;\n" +
                   "Olungama ndi am’dziko; Aone tatsukidwa, Yesu ali mumtima, Tidziwitse kuti ndi’fe, Christ’s Ambassadors.\n" +
                   "\n" +
                   "We are Christ’s Ambassadors, And our colours we must unfurl, Clean and righteous before the world, We must show we’re cleansed from sin, And that Jesus rules within, Proving duly, that we’re truly, Christ’s Ambassadors.\n"),
           new Hymns(296,"296.Yesu Atiuza Tiwalefe (Jesus bids Us Shine)","1.\tYesu atiuza tiwale’fe, Monga nyali m’mdima tiunike mbu! Pansi pali mdima, walanitu, Inu m’malo mwanu ndi inemu.\n" +
                   "\n" +
                   "2.\tYesu atiuza tiyambemo, Atione bwino ndi kuwalako, Ayang’ana pansi, aonaku\n" +
                   "Inu m’malo mwanu ndi inemu.\n" +
                   "\n" +
                   "3.\tYesu atiuza tiwale pa, Anthu ali m’mdima osaukawa, Tiwalire onse, tonsefetu,\n" +
                   "Inu m’malo mwanu ndi inemu.\n" +
                   "\n"),
           new Hymns(297,"297.Yesu Adza Kuwerenga (Like the Stars)","1.\tYesu adza kuwerenga, Ana ake abwino, Ndi kuvala zachifumu, Chakuwalacho chake.\n" +
                   "\n" +
                   "Ana omwe angonga, Nyenyezi za m’Mwamba, Nadza naye kondwere, Onyezima nye!\n" +
                   "\n" +
                   "2.\tYesu adza kukundika, Ana ake ankhosa, Ndiye Mbusa wakufatsa, Namalezatu lere.\n" +
                   "\n" +
                   "3.\tKudzachera tsiku lijalo, Msangatu msanga, Kudzawala m’mawa wakewo\n" +
                   "Pompano ponse.\n"),
           new Hymns(298,"298.Yesu Andikonda Ine (Yes, Jesus Loves Me)","1.\tYesu andikonda ine, Amatero m’Buku Iye, Akafooka mwana wake,\n" +
                   "Adzamlimbitsa Mbuye.\n" +
                   "\n" +
                   "Yesu akonda, Yesu akonda, Yesu akonda, Atero m’Bukumo.\n" +
                   "\n" +
                   "2.\tMbuye Yesu andisunga, M’njira ya Kumwamba kuja, Andigwira m’dzanja langa\n" +
                   "Ndingagweremo m’makwawa.\n" +
                   "\n" +
                   "3.\tYesu andikonda Ine, Ndikadzafa tsiku lina, Atenga ine kuno, Ndikakhale naye kwawo.\n"),
           new Hymns(299,"299,Ndikondwa Kuti Atate(I am So Glad)","1.\tNdikondwa kuti Atate wa m’Mwamba, Atidziwitsa chikondicho chake,\n" +
                   "Ndimawerenga Uthenga Wabwino, Kuti Ambuye akond’ana ake.\n" +
                   "\n" +
                   "Ndikondwa kuti Yesu akonda, Yesu akonda, andikondabe, Ndikondwa kuti Yesu akonda,\n" +
                   "Amandikondabe.\n" +
                   "\n" +
                   "2.\tYesu ndikonda akondanso ine, Anandifera pa mtanda woopsa, Wosayenera oipa ine, Tsoka langalo Ambuye nachotsa.\n" +
                   "\n" +
                   "3.\tMzimu Woyera akhala mwa ine, Atsimikiza chikondi cha Yesu, Ine ntachimwa amandikumbutsa, Lapa mwanawe, akukonda Yesu.\n" +
                   "\n"),
           new Hymns(300,"300. Uko Ndi Uko (There and Beyond)","Uko ndi uko, monga nyanjatu, Chikondi cha Yesu chimandizinga"),
           new Hymns(301,"301.Ine Ndifuna Kupita Kumwamba (I want to Go to Heaven)","Ine ndifuna kupita Kumwamba, Kumwamba ine n’kadzafa (anso)\n" +
                   "(Kumwamba) Kumwamba, Kumwamba, Kumwamba, (Kumwamba)\n" +
                   "Kumwamba ine n’kadzafa.\n"),
           new Hymns(302,"302 Tili Alendo (We are Stranger)","Tili alendo ife pa dziko lino, Tipita kwathu Kumwambako (anso)\n" +
                   "Titi! Aleluya, aleluya, aleluya, aleluya! Aleluya, aleluya, aleluya, aleluya!\n"),
           new Hymns(303,"303.Chikondi Chikulu (Love is Great)","1.\tChikondi chikulu, chikulu, chikulu (x3) Chikondi chikulu.\n" +
                   "\n" +
                   "2.\tCha Yesu chikulu, chikulu, chikulu (x3) Cha Yesu chikulu.\n" +
                   "\n" +
                   "3.\tCha anthu chichepa, chichepa, chichepa (x3) Chimatha m’sanga!\n"),
           new Hymns(304,"304.Mtendere Nonse (Good Morning to You)","Mtendere nonse, mtendere nonse, Tsikuli labwino, mtendere nonse,\n" +
                   "Mtendere nonse, mtendere nonse, Kwa onse am’muno, mtendere nonse.\n" +
                   "\n" +
                   "Good morning to you (anso) This glad Sunday morning,\n" +
                   "Good morning to you, (anso) Good morning to you.\n" +
                   "\n"),
           new Hymns(305,"305.Chisefuka (Running Over)","Chisefuka, chisefuka, Chikho changa chisefuka, Nditapulumuka, ndimakhala wokondwa, Chikho changa chisefuka.\n" +
                   "\n" +
                   "Running over, running over, My cup is full and running over, Since the Lord saved me, I’m as happy as can be, My cup is full and running over.\n"),
           new Hymns(306,"306.Sande Sukulu (Sunday School)","Tonse tizipita ku Sande Sukulu, Sande sukulu,sande sukulu, Amuna ndi akazi,\n" +
                   "Anyamata ndi atsikana, Tonse tizipita ku Sande sukulu.\n"),
           new Hymns(307,"307.Yesu Amakonda Ana (Jesus Loves the Little Children)","Yesu amakonda ana, ana onse ponsepo, Am`mitundu yonseyo, akuda ndi oyera,\n" +
                   "Yesu amakonda ana ponsepo.\n"),
           new Hymns(308,"308.Kanyali kanga kakango'ono (This Little Light of Mine)","Kanyali kanga kakangòno, Ndileke kawale, (anso)\n" +
                   "Kawale kawalire Yesu.\n" +
                   "\n" +
                   "-Bisa pansi padengu, ayi\n" +
                   "-Satana asazime, phe.\n" +
                   "-M`dziko lonse la Malawi.\n" +
                   "\n"),
           new Hymns(309,"309.Ngati Tikoka Pamodzi","Ngati tikoka pamodzi, pamodzi, pamodzi, Ngati tikoka pamodzi,\n" +
                   "Tidzakondwera.  Ntchito yako ndi yanga, Ntchito yathu nja Mulungu,\n" +
                   "Ngati tikoka pamodzi, Tidzakondwera.\n" +
                   "\n" +
                   "If we all pull together, together, together, If we all pull together,\n" +
                   "How happy we’ll be, For your work is my work. And our work is God’s work,\n" +
                   "If we all pull together, How happy we’ll be.\n" +
                   "\n"),
           new Hymns(310,"310.Ukalimba Mtima (Strong Heart)","\tUkalimba mtima udzauona (x3) (Ulemerero) Ambuye Yesu ali nkubwera.\n" +
                   "\n" +
                   "2.\tAnasenza mtanda chifukwa cha ine (x3) (Tiyamike) Ambuye Yesu ali nkubwera\n" +
                   "\n" +
                   "3.\tAnakhomedwa chifkwa cha ine (x3) (Tiyamike) Ambuye Yesu ali nkubwera.\n"),
           new Hymns(311,"211.Yesu Antenga katundu (Jesus took My Burdens)","Yesu anatenga katundu wangayo, Namponya pa nyanja (x2)\n" +
                   "Ndiri wokondwera, kukondwa kwambiri,\n" +
                   "Yesu anamponya katundu pa nyanja.\n"),
           new Hymns(312,"312. Yesu! Yesu! (Jesus Jesus)","Yesu! Yesu! Yesu! Yesu! Yesu! Yesu! Yesu! (x2)\n" +
                   "Amen! Amen!Amen! Amen!Amen!Amen! Amen! (x2)\n"),
           new Hymns(313,"313. Chimwemwe Joy,Joy,Joy","Chimwemwe, chimwemwe ndiri nacho, M’mtimanga ndiyimba leroli,\n" +
                   "Machimo achotsedwa, Kumwamba kuli kwanga, Mtimanga umadzala ndi chimwemwecho\n"),
           new Hymns(314,"Daniel ","Daniel’ anapemphera pa tsiku katatu, Potero anam’ponya m’dzenje la mikango;\n" +
                   "Chinkana, chinkana, mantha analibe, Mlungu anatseka pakamwa pa mikango.\n" +
                   "\n" +
                   "Ahebri anakana kupembedza fano, Mfumu inawaponya mung’anjo ya moto\n" +
                   "Chinkana, chinkana, mantha analibe, Mbuye analowamo nawatchinjiriza.\n"),
           new Hymns(315,"315. Ameneyu Ndani (Who is This )","Ameneyu ndani (x3) Ndi Yesu.  Ameneyu ndani (x3) Ndi Yesu.\n" +
                   "\n"),
           new Hymns(316,"316.Tirikunka Kumwamba (Going to a Mission)","Tirikunka Kumwamba pa sitima ya Yesu, Tikiti m’manja mwathu anatigulira,\n" +
                   "Akanena, “Lowani!” Tidzayankha, “Inde” Tirikunka Kumwamba pa sitima ya Yesu.\n"),
           new Hymns(317,"317.Wamzeru (The Wise Man )","Wanzeru anamanga nyumba oa thanthwe (x3) Ndipo mvula inagwa puu.\n" +
                   "\n" +
                   "Inagwa mvula nidzala mitsinje (3x) Ndipo nyumba inakhala nji.\n" +
                   "\n" +
                   "Wopusa anamanga nyumba pamchenga (3x) Ndipo mvula inagwa puu.\n" +
                   "\n" +
                   "Inagwa mvua nidzadza mitsinje (3x) Ndipo nyumba inagwa pwata!\n" +
                   "\n"),
           new Hymns(318,"318.Yesu Yekha (Only Jesus)","Yesu yekha (2x) Yesuyo akwaniritsa, Vuto lonse likhala mdalitso,\n" +
                   "Pomwe ndidziwa ali wanga.\n"),
           new Hymns(319,"319.Haleluya","Halleluya (8x) Zikomo Yesu (8x) Ndi Mbuye wanga (8x) Halleluya (8x)"),
           new Hymns(320,"320.Wamoyo (Alive)","Wamoyo (2x) Wamoyo Yesuyo, Yesuyo wamoyo, wa moyo muyaya.\n" +
                   "\n" +
                   "Wamoyo (2x) Wamoyo Yesuyo, Yesuyo wa moyo,  wamoyo.\n" +
                   "\n" +
                   "Yimba Alleluya (2x) Yesuyo wa moyo muyaya.\n" +
                   "\n" +
                   "Yimba Alleluya (2x) Yesuyo wamoyo.\n"),
           new Hymns(321,"321.Yang'ana Yesu (Look to Jesus)","Yang’ana, yang’ana , yang’ana Yesu (3x) Ndiye m’modzi anakufera.\n" +
                   "\n" +
                   "Mlandire, mlandire, mlandire Yesu (3x) Ndiye m’modzi anakufera.\n"),
           new Hymns(322,"322.Ngati Wapulumuka (If You're saved and You Know It)","Ngati wapulumuka, nen’ Amen! Ngati wapulumuka, nen’ Amen!\n" +
                   "Ngati waulumuka, moyo wako usefuka, Ngati wapulumuka, nen’ Amen! Amen!\n"),
           new Hymns(323,"323.Amyenda Ndi Yesu (Walk with Jesus)","Amayenda ndi Yesu amaoneka (3x) Amaoneka mayendedwe."),
           new Hymns(324,"324.Abwera Yesu (Jesus is Coming)","Abwera Yesu,  Amen Alleluya (x2)\n" +
                   "Mfumu ya mafumu, Amen Alleluya\n" +
                   "Karonga wamtendere, Amene Alleluya.\n"),
           new Hymns(325,"325.Zakeyo","Zakeyo anali munthu wamng’ono mumsinkhu, Anakwera mu mkuyumo kuti aone Mbuye; Mbuye anapitirira nayang’ana m`mtengo, Nati, “Zakeyo, fulumira nutsike,\n" +
                   "Ndikacheze m`nyumbamo lero.\n"),
           new Hymns(326,"326.Thandizo Langa (My Help)","1.\tThandizo langa lidzera kwa yani? Thandizo langa lidzera kwa Yesu (anso).\n" +
                   "Adzanditenga (3x) Kunka nane kumwamba (anso)\n" +
                   "\n" +
                   "2.\tDalitso langa lidzera kwa yani? Dalitso langa lidzera kwa Yesu (anso)\n" +
                   "\n" +
                   "3.\tPemphero langa lidzera kwa yani?  Pemphero langa lidzera kwa Yesu (anso).\n"),
           new Hymns(327,"327.Tumizeni Moto (Send the Fire)","O, Mbuye tumizeni moto (x3), Utigwere tonse`fe"),
           new Hymns(328,"328.moyo Wanga (My heart)","Moyo wanga! Moyo wanga umakonda Yesu (4x)."),
           new Hymns(329,"329.Dzuko, Lero, Kumuyaya (Yesterday,Today,Forever)","Dzulo, lero, kumuyaya, Yesu ndi yemweyo! Yesu sadzasinthika konse.\n" +
                   "Ulemerero! Ulemerero! Ulemerero! Yesu sadzasinthika konse, Ulemerero!\n" +
                   "\n"),
           new Hymns(330,"330. Ndingoti Mwemwemwe (I Have Joy, Joy, joy)","1.\tNdingoti mwe, mwe, mwe, mwe, m`mtima mwanga, M’mtima mwanga. M’mtima mwanga; Ndingoti mwe, mwe, mwe, mwe, m`mtima mwanga, M’mtima mwangamu.\n" +
                   "\n" +
                   "2.\tNdiri nacho chimwemwe cha Yesu, m’mtima mwanga, M’mtima mwanga. M’mtima mwanga; Ndiri nachi chimwemwe cha Yesu,  m’mtima mwanga\n" +
                   "M’mtima mwangamu.\n" +
                   "\n" +
                   "3.\tNdiri mdi mtendere wosayeseka, m’mtima mwanga, M’mtima mwanga, m’mtima mwanga; Ndiri ndi mtendere wosayeseka, m’mtima mwanga, M’mtima mwangamu.\n" +
                   "\n" +
                   "4.\tTsopano kulibenso kutsutsidwa, m’mtima mwanga, M’mtima mwanga, m’mtima mwanga; Tsopano kulibenso kutsutsidwa, m’mtima mwanga, M’mtima mwangamu.\n" +
                   "\n" +
                   "\n"),
           new Hymns(331,"331.Davide Mnyamatayo (Only a Boy Named David)","Davide mnyamatayo, anali wolimba, Davide nangokhala nacho choponyera;\n" +
                   "Davide mnyamatayo napita kumtsinje, Davide anatola timayala tisanu,\n" +
                   "Naika kamwala m’choponyera, nazungulizatu; Naika kamwala m’choponyera,\n" +
                   "nazungulizatu; O, zungu, zungu, zungu, zungu, zunguliratu; Kamwala fi! Pa\n" +
                   "mphumi kho!  Chiwinda chinagwa, woyolo! Woyolo!\n" +
                   "\n")









   };

    public int getHymnNumber(){
        return hymnNumber;
    }

    public String getHymnTitle() {
        return hymnTitle;
    }

    public String getHymnLyrics() {return hymnLyrics; }
    public String toString(){
        return this.hymnTitle;
    }


}

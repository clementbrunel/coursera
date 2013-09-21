package patmat

object mine {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
   import Huffman._
  
  //val frenchCode: CodeTree = Fork(Fork(Fork(Leaf('s',121895),Fork(Leaf('d',56269),Fork(Fork(Fork(Leaf('x',5928),Leaf('j',8351),List('x','j'),14279),Leaf('f',16351),List('x','j','f'),30630),Fork(Fork(Fork(Fork(Leaf('z',2093),Fork(Leaf('k',745),Leaf('w',1747),List('k','w'),2492),List('z','k','w'),4585),Leaf('y',4725),List('z','k','w','y'),9310),Leaf('h',11298),List('z','k','w','y','h'),20608),Leaf('q',20889),List('z','k','w','y','h','q'),41497),List('x','j','f','z','k','w','y','h','q'),72127),List('d','x','j','f','z','k','w','y','h','q'),128396),List('s','d','x','j','f','z','k','w','y','h','q'),250291),Fork(Fork(Leaf('o',82762),Leaf('l',83668),List('o','l'),166430),Fork(Fork(Leaf('m',45521),Leaf('p',46335),List('m','p'),91856),Leaf('u',96785),List('m','p','u'),188641),List('o','l','m','p','u'),355071),List('s','d','x','j','f','z','k','w','y','h','q','o','l','m','p','u'),605362),Fork(Fork(Fork(Leaf('r',100500),Fork(Leaf('c',50003),Fork(Leaf('v',24975),Fork(Leaf('g',13288),Leaf('b',13822),List('g','b'),27110),List('v','g','b'),52085),List('c','v','g','b'),102088),List('r','c','v','g','b'),202588),Fork(Leaf('n',108812),Leaf('t',111103),List('n','t'),219915),List('r','c','v','g','b','n','t'),422503),Fork(Leaf('e',225947),Fork(Leaf('i',115465),Leaf('a',117110),List('i','a'),232575),List('e','i','a'),458522),List('r','c','v','g','b','n','t','e','i','a'),881025),List('s','d','x','j','f','z','k','w','y','h','q','o','l','m','p','u','r','c','v','g','b','n','t','e','i','a'),1486387)
   println(frenchCode)                            //>            /-(a:117110)
                                                  //|         /-(ai:232575)
                                                  //|         |  \-(i:115465)
                                                  //|      /-(aei:458522)
                                                  //|      |  \-(e:225947)
                                                  //|   /-(abceginrtv:881025)
                                                  //|   |  |     /-(t:111103)
                                                  //|   |  |  /-(nt:219915)
                                                  //|   |  |  |  \-(n:108812)
                                                  //|   |  \-(bcgnrtv:422503)
                                                  //|   |     |           /-(b:13822)
                                                  //|   |     |        /-(bg:27110)
                                                  //|   |     |        |  \-(g:13288)
                                                  //|   |     |     /-(bgv:52085)
                                                  //|   |     |     |  \-(v:24975)
                                                  //|   |     |  /-(bcgv:102088)
                                                  //|   |     |  |  \-(c:50003)
                                                  //|   |     \-(bcgrv:202588)
                                                  //|   |        \-(r:100500)
                                                  //| (abcdefghijklmnopqrstuvwxyz:1486387)
                                                  //|   |        /-(u:96785)
                                                  //|   |     /-(mpu:188641)
                                                  //|   |     |  |  /-(p:46335)
                                                  //|   |     |  \-(mp:91856)
                                                  //|   |     |     \-(m:45521)
                                                  //|   |  /-(lmopu:355071)
                                                  //|   |  |  |  /-(l:83668)
                                                  //|   |  |  \-(lo:166430)
                                                  //|   |  |     \-(o:82762)
                                                  //|   \-(dfhjklmopqsuwxyz:605362)
                                                  //|      |           /-(q:20889)
                                                  //|      |        /-(hkqwyz:41497)
                                                  //|      |        
                                                  //| Output exceeds cutoff limit.























  println(decodedSecret)                          //> List(h, i, e, f, e, a, l, s, t, d, r, s)
}
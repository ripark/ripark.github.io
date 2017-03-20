#Proj2Driver.py
#Test Driver for COSC 251 Project 2
#Spring 2017
#Last Revision - 2/23/2017
#Alan C. Jamieson

#To run, make sure that your Proj2.py file is in the
#same directory as this file.
#Open this file in IDLE and Run Module (F5)

import Proj2

#Problem 1
#Expected output
#16
#42
#11
#539054
Proj2.Problem1("32 20")
Proj2.Problem1("2016 100")
Proj2.Problem1("149239876439186 470")
Proj2.Problem1("4851495 95")

#Problem 2
#Expected output
#THECO MMISS ARSAY SHELL OABCD
#AIGIS AGREA TINVE STMEN TAAAA
#PROGR AMMIN GALLD AYISF UNAAA
Proj2.Problem2("54123 OSYLD CSALC TMASO HMRHA EISEB")
Proj2.Problem2("41532 IEVEA AATST SAENA GRNMA IGITA")
Proj2.Problem2("52341 RNDFA RMAYN OMLIA GILSA PAGAU")

#Problem 3
#User input based
#Additional Tests:
#Input:
#1 1
#1
#Output:
#1
#Input:
#32 6
#3087 3084 3088 3089 3092 3093
#191 190 189 192 188 193
#1800 1798 1801 1802 1804 1803
#790 788 786 789 791 792
#3092 3093 3094 3095 3091 3088
#1711 1710 1707 1706 1708 1709
#325 324 327 330 332 329
#1535 1536 1534 1533 1537 1532
#1714 1716 1719 1718 1720 1721
#3104 3102 3105 3103 3100 3098
#1956 1958 1955 1952 1949 1948
#520 522 525 523 521 524
#2944 2947 2949 2946 2948 2945
#2151 2149 2152 2150 2148 2146
#780 778 781 784 785 786
#3173 3170 3172 3169 3167 3168
#2302 2303 2304 2301 2305 2300
#508 506 507 509 505 510
#3149 3148 3146 3150 3151 3152
#1488 1491 1492 1493 1490 1494
#383 384 386 389 387 390
#1884 1885 1887 1890 1889 1886
#2032 2030 2029 2028 2026 2031
#1316 1317 1315 1314 1318 1313
#3119 3117 3115 3116 3113 3110
#1715 1716 1714 1712 1710 1711
#2277 2279 2282 2281 2283 2280
#1354 1355 1352 1356 1353 1357
#1954 1956 1955 1957 1953 1958
#1697 1694 1698 1695 1696 1693
#2009 2010 2007 2008 2011 2006
#437 438 441 444 446 443
#Output:
#23
#Input:
#9 15
#644 643 642 640 645 641 639 646 638 647 637 636 648 635 649
#577 579 576 578 575 573 572 574 571 580 581 570 582 584 585
#837 835 838 839 840 836 834 841 833 831 832 830 842 843 829
#225 224 222 220 218 219 217 221 216 223 215 226 228 227 229
#194 192 190 189 188 191 193 187 195 196 186 197 199 185 198
#787 789 786 784 783 785 782 781 788 790 792 780 791 793 795
#634 632 635 633 631 629 628 626 625 627 624 630 636 623 621
#644 642 640 641 643 639 637 638 645 636 635 633 634 632 631
#864 863 862 865 861 860 866 867 859 868 858 857 869 856 855
#Output:
#9
Proj2.Problem3()
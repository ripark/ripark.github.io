; Proj4Driver.lisp
; Driver file for COSC 251, Project 4
; Alan C. Jamieson
; Last Revision: April 10, 2017

; To run, place Proj4.lisp on your desktop, then compile/load this file (C-c C-k)

(load "~/Desktop/Proj4.lisp")

; Test Output
; IUYI oy gckyusk
; Whwj eo w cnawp lnkbaookn
; Zwbrgom wg pshhsf
; Simon is best
; eciwmvr
; naqeoxp
; lyikkgtrbjkgzmeolxbi
; VVGAXXVF VVFF ADXAAGFAAV
; DAAADAFGDXDX DAGD VDAVVXDFFVDX
; GAAGXGAXVXVXXD DFAV GVAGAXFV

(print (caesar "COSC is awesome" 6))
(print (caesar "Alan is a great professor " 22))
(print (caesar "Lindsay is better" 40))
(print (caesar "Simon is best" 0))
(print (vig "lindsay" "abc"))
(print (vig "stmarys" "college"))
(print (vig "supercalifragilistic" "alan"))
(print (adf "lisp is awful" "stmary" "ph0qg64mea1yl2nofdxkr3cvs5zw7bj9uti8"))
(print (adf "python is better" "mario" "ndhmbrutyk7jcivl0xo81awg956s3qfp4ze2"))
(print (adf "cosc251 is best" "lindsay" "tr1vpy9xqdai0m3o8nbg4kh62ejsuw57flzc"))


\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{techdoc}[2017/08/18 Technical documentation]

\LoadClass[a4paper]{report}

\usepackage{url}
\usepackage[breaklinks=true]{hyperref}
\usepackage{csquotes}
\usepackage{inconsolata}
\usepackage[default]{lato}
\usepackage{xcolor}
\usepackage[fleqn]{amsmath}
%\usepackage[outputdir=../auxil]{minted}
\usepackage[framemethod=TikZ]{mdframed}
\usepackage{nameref}
\usepackage{relsize}

\newcommand\newrefname[1]{\edef\@currentlabelname{#1}} % New \nameref name

\setlength{\oddsidemargin}{0in}
\setlength{\evensidemargin}{0in}
\setlength{\topmargin}{0in}
\setlength{\headsep}{-.25in}
\setlength{\textwidth}{6.5in}
\setlength{\textheight}{8.5in}

\pdfmapfile{+lato.map}

\hypersetup{
colorlinks = true,
urlcolor   = black,
linkcolor  = black,
citecolor  = black
}

%\setminted{autogobble}

\mdfsetup{skipabove=\topskip,skipbelow=\topskip}

\newenvironment{note}[1][]{%
\ifstrempty{#1}{%
\mdfsetup{%
frametitle={%
\tikz[baseline=(current bounding box.east), outer sep=0pt]
\node[anchor=east, rectangle, fill=blue!20]
{\strut Note};
},%
}%
}{%
\mdfsetup{%
frametitle={%
\tikz[baseline=(current bounding box.east), outer sep=0pt]
\node[anchor=east, rectangle, fill=blue!20]
{\strut Note: #1};
},%
}%
}%
\mdfsetup{%
innertopmargin=2pt,%
linecolor=blue!20,%
linewidth=2pt,%
topline=true,%
frametitleaboveskip=\dimexpr-\ht\strutbox\relax,%
}%
\begin{mdframed}[]\relax%
}{%
\end{mdframed}%
}

\newcommand\code[1]{\texttt{#1}}
\newcommand{\Command}[1]{\command{#1}\mbox{}\\}
\newcommand{\command}[1]{\item[\code{#1}]}

\endinput


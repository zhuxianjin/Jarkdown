package top.j0k3r;

import java.util.*;
import java.io.*;

/**
 * 存有 css 主题样式
 */

public class PreviewCss {

    public static Map<String, String> map = new HashMap<String, String>();

    public static final String theme_1 = "<style type=\"text/css\">\n" +
            "body {\n" +
            "  font-family: Helvetica, arial, sans-serif;\n" +
            "  font-size: 14px;\n" +
            "  line-height: 1.6;\n" +
            "  padding-top: 10px;\n" +
            "  padding-bottom: 10px;\n" +
            "  background-color: white;\n" +
            "  padding: 30px; }\n" +
            "\n" +
            "body > *:first-child {\n" +
            "  margin-top: 0 !important; }\n" +
            "body > *:last-child {\n" +
            "  margin-bottom: 0 !important; }\n" +
            "\n" +
            "a {\n" +
            "  color: #4183C4; }\n" +
            "a.absent {\n" +
            "  color: #cc0000; }\n" +
            "a.anchor {\n" +
            "  display: block;\n" +
            "  padding-left: 30px;\n" +
            "  margin-left: -30px;\n" +
            "  cursor: pointer;\n" +
            "  position: absolute;\n" +
            "  top: 0;\n" +
            "  left: 0;\n" +
            "  bottom: 0; }\n" +
            "\n" +
            "h1, h2, h3, h4, h5, h6 {\n" +
            "  margin: 20px 0 10px;\n" +
            "  padding: 0;\n" +
            "  font-weight: bold;\n" +
            "  -webkit-font-smoothing: antialiased;\n" +
            "  cursor: text;\n" +
            "  position: relative; }\n" +
            "\n" +
            "h1:hover a.anchor, h2:hover a.anchor, h3:hover a.anchor, h4:hover a.anchor, h5:hover a.anchor, h6:hover a.anchor {\n" +
            "  background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA09pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoMTMuMCAyMDEyMDMwNS5tLjQxNSAyMDEyLzAzLzA1OjIxOjAwOjAwKSAgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6OUM2NjlDQjI4ODBGMTFFMTg1ODlEODNERDJBRjUwQTQiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6OUM2NjlDQjM4ODBGMTFFMTg1ODlEODNERDJBRjUwQTQiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo5QzY2OUNCMDg4MEYxMUUxODU4OUQ4M0REMkFGNTBBNCIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo5QzY2OUNCMTg4MEYxMUUxODU4OUQ4M0REMkFGNTBBNCIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PsQhXeAAAABfSURBVHjaYvz//z8DJYCRUgMYQAbAMBQIAvEqkBQWXI6sHqwHiwG70TTBxGaiWwjCTGgOUgJiF1J8wMRAIUA34B4Q76HUBelAfJYSA0CuMIEaRP8wGIkGMA54bgQIMACAmkXJi0hKJQAAAABJRU5ErkJggg==) no-repeat 10px center;\n" +
            "  text-decoration: none; }\n" +
            "\n" +
            "h1 tt, h1 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h2 tt, h2 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h3 tt, h3 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h4 tt, h4 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h5 tt, h5 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h6 tt, h6 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h1 {\n" +
            "  font-size: 28px;\n" +
            "  color: black; }\n" +
            "\n" +
            "h2 {\n" +
            "  font-size: 24px;\n" +
            "  border-bottom: 1px solid #cccccc;\n" +
            "  color: black; }\n" +
            "\n" +
            "h3 {\n" +
            "  font-size: 18px; }\n" +
            "\n" +
            "h4 {\n" +
            "  font-size: 16px; }\n" +
            "\n" +
            "h5 {\n" +
            "  font-size: 14px; }\n" +
            "\n" +
            "h6 {\n" +
            "  color: #777777;\n" +
            "  font-size: 14px; }\n" +
            "\n" +
            "p, blockquote, ul, ol, dl, li, table, pre {\n" +
            "  margin: 15px 0; }\n" +
            "\n" +
            "hr {\n" +
            "  background: transparent url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAAECAYAAACtBE5DAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBNYWNpbnRvc2giIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6OENDRjNBN0E2NTZBMTFFMEI3QjRBODM4NzJDMjlGNDgiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6OENDRjNBN0I2NTZBMTFFMEI3QjRBODM4NzJDMjlGNDgiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo4Q0NGM0E3ODY1NkExMUUwQjdCNEE4Mzg3MkMyOUY0OCIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo4Q0NGM0E3OTY1NkExMUUwQjdCNEE4Mzg3MkMyOUY0OCIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PqqezsUAAAAfSURBVHjaYmRABcYwBiM2QSA4y4hNEKYDQxAEAAIMAHNGAzhkPOlYAAAAAElFTkSuQmCC) repeat-x 0 0;\n" +
            "  border: 0 none;\n" +
            "  color: #cccccc;\n" +
            "  height: 4px;\n" +
            "  padding: 0;\n" +
            "}\n" +
            "\n" +
            "body > h2:first-child {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "body > h1:first-child {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "  body > h1:first-child + h2 {\n" +
            "    margin-top: 0;\n" +
            "    padding-top: 0; }\n" +
            "body > h3:first-child, body > h4:first-child, body > h5:first-child, body > h6:first-child {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "\n" +
            "a:first-child h1, a:first-child h2, a:first-child h3, a:first-child h4, a:first-child h5, a:first-child h6 {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "\n" +
            "h1 p, h2 p, h3 p, h4 p, h5 p, h6 p {\n" +
            "  margin-top: 0; }\n" +
            "\n" +
            "li p.first {\n" +
            "  display: inline-block; }\n" +
            "li {\n" +
            "  margin: 0; }\n" +
            "ul, ol {\n" +
            "  padding-left: 30px; }\n" +
            "\n" +
            "ul :first-child, ol :first-child {\n" +
            "  margin-top: 0; }\n" +
            "\n" +
            "dl {\n" +
            "  padding: 0; }\n" +
            "  dl dt {\n" +
            "    font-size: 14px;\n" +
            "    font-weight: bold;\n" +
            "    font-style: italic;\n" +
            "    padding: 0;\n" +
            "    margin: 15px 0 5px; }\n" +
            "    dl dt:first-child {\n" +
            "      padding: 0; }\n" +
            "    dl dt > :first-child {\n" +
            "      margin-top: 0; }\n" +
            "    dl dt > :last-child {\n" +
            "      margin-bottom: 0; }\n" +
            "  dl dd {\n" +
            "    margin: 0 0 15px;\n" +
            "    padding: 0 15px; }\n" +
            "    dl dd > :first-child {\n" +
            "      margin-top: 0; }\n" +
            "    dl dd > :last-child {\n" +
            "      margin-bottom: 0; }\n" +
            "\n" +
            "blockquote {\n" +
            "  border-left: 4px solid #dddddd;\n" +
            "  padding: 0 15px;\n" +
            "  color: #777777; }\n" +
            "  blockquote > :first-child {\n" +
            "    margin-top: 0; }\n" +
            "  blockquote > :last-child {\n" +
            "    margin-bottom: 0; }\n" +
            "\n" +
            "table {\n" +
            "  padding: 0;border-collapse: collapse; }\n" +
            "  table tr {\n" +
            "    border-top: 1px solid #cccccc;\n" +
            "    background-color: white;\n" +
            "    margin: 0;\n" +
            "    padding: 0; }\n" +
            "    table tr:nth-child(2n) {\n" +
            "      background-color: #f8f8f8; }\n" +
            "    table tr th {\n" +
            "      font-weight: bold;\n" +
            "      border: 1px solid #cccccc;\n" +
            "      margin: 0;\n" +
            "      padding: 6px 13px; }\n" +
            "    table tr td {\n" +
            "      border: 1px solid #cccccc;\n" +
            "      margin: 0;\n" +
            "      padding: 6px 13px; }\n" +
            "    table tr th :first-child, table tr td :first-child {\n" +
            "      margin-top: 0; }\n" +
            "    table tr th :last-child, table tr td :last-child {\n" +
            "      margin-bottom: 0; }\n" +
            "\n" +
            "img {\n" +
            "  max-width: 100%; }\n" +
            "\n" +
            "span.frame {\n" +
            "  display: block;\n" +
            "  overflow: hidden; }\n" +
            "  span.frame > span {\n" +
            "    border: 1px solid #dddddd;\n" +
            "    display: block;\n" +
            "    float: left;\n" +
            "    overflow: hidden;\n" +
            "    margin: 13px 0 0;\n" +
            "    padding: 7px;\n" +
            "    width: auto; }\n" +
            "  span.frame span img {\n" +
            "    display: block;\n" +
            "    float: left; }\n" +
            "  span.frame span span {\n" +
            "    clear: both;\n" +
            "    color: #333333;\n" +
            "    display: block;\n" +
            "    padding: 5px 0 0; }\n" +
            "span.align-center {\n" +
            "  display: block;\n" +
            "  overflow: hidden;\n" +
            "  clear: both; }\n" +
            "  span.align-center > span {\n" +
            "    display: block;\n" +
            "    overflow: hidden;\n" +
            "    margin: 13px auto 0;\n" +
            "    text-align: center; }\n" +
            "  span.align-center span img {\n" +
            "    margin: 0 auto;\n" +
            "    text-align: center; }\n" +
            "span.align-right {\n" +
            "  display: block;\n" +
            "  overflow: hidden;\n" +
            "  clear: both; }\n" +
            "  span.align-right > span {\n" +
            "    display: block;\n" +
            "    overflow: hidden;\n" +
            "    margin: 13px 0 0;\n" +
            "    text-align: right; }\n" +
            "  span.align-right span img {\n" +
            "    margin: 0;\n" +
            "    text-align: right; }\n" +
            "span.float-left {\n" +
            "  display: block;\n" +
            "  margin-right: 13px;\n" +
            "  overflow: hidden;\n" +
            "  float: left; }\n" +
            "  span.float-left span {\n" +
            "    margin: 13px 0 0; }\n" +
            "span.float-right {\n" +
            "  display: block;\n" +
            "  margin-left: 13px;\n" +
            "  overflow: hidden;\n" +
            "  float: right; }\n" +
            "  span.float-right > span {\n" +
            "    display: block;\n" +
            "    overflow: hidden;\n" +
            "    margin: 13px auto 0;\n" +
            "    text-align: right; }\n" +
            "\n" +
            "code, tt {\n" +
            "  margin: 0 2px;\n" +
            "  padding: 0 5px;\n" +
            "  white-space: nowrap;\n" +
            "  border: 1px solid #eaeaea;\n" +
            "  background-color: #f8f8f8;\n" +
            "  border-radius: 3px; }\n" +
            "\n" +
            "pre code {\n" +
            "  margin: 0;\n" +
            "  padding: 0;\n" +
            "  white-space: pre;\n" +
            "  border: none;\n" +
            "  background: transparent; }\n" +
            "\n" +
            ".highlight pre {\n" +
            "  background-color: #f8f8f8;\n" +
            "  border: 1px solid #cccccc;\n" +
            "  font-size: 13px;\n" +
            "  line-height: 19px;\n" +
            "  overflow: auto;\n" +
            "  padding: 6px 10px;\n" +
            "  border-radius: 3px; }\n" +
            "\n" +
            "pre {\n" +
            "  background-color: #f8f8f8;\n" +
            "  border: 1px solid #cccccc;\n" +
            "  font-size: 13px;\n" +
            "  line-height: 19px;\n" +
            "  overflow: auto;\n" +
            "  padding: 6px 10px;\n" +
            "  border-radius: 3px; }\n" +
            "  pre code, pre tt {\n" +
            "    background-color: transparent;\n" +
            "    border: none; }\n" +
            "\n" +
            "sup {\n" +
            "    font-size: 0.83em;\n" +
            "    vertical-align: super;\n" +
            "    line-height: 0;\n" +
            "}\n" +
            "\n" +
            "kbd {\n" +
            "  display: inline-block;\n" +
            "  padding: 3px 5px;\n" +
            "  font-size: 11px;\n" +
            "  line-height: 10px;\n" +
            "  color: #555;\n" +
            "  vertical-align: middle;\n" +
            "  background-color: #fcfcfc;\n" +
            "  border: solid 1px #ccc;\n" +
            "  border-bottom-color: #bbb;\n" +
            "  border-radius: 3px;\n" +
            "  box-shadow: inset 0 -1px 0 #bbb\n" +
            "}\n" +
            "\n" +
            "* {\n" +
            "\t-webkit-print-color-adjust: exact;\n" +
            "}\n" +
            "@media screen and (min-width: 914px) {\n" +
            "    body {\n" +
            "        width: 854px;\n" +
            "        margin:0 auto;\n" +
            "    }\n" +
            "}\n" +
            "@media print {\n" +
            "\ttable, pre {\n" +
            "\t\tpage-break-inside: avoid;\n" +
            "\t}\n" +
            "\tpre {\n" +
            "\t\tword-wrap: break-word;\n" +
            "\t}\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
            "<style type=\"text/css\">\n" +
            "/**\n" +
            " * prism.js default theme for JavaScript, CSS and HTML\n" +
            " * Based on dabblet (http://dabblet.com)\n" +
            " * @author Lea Verou\n" +
            " */\n" +
            "\n" +
            "code[class*=\"language-\"],\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tcolor: black;\n" +
            "\tbackground: none;\n" +
            "\ttext-shadow: 0 1px white;\n" +
            "\tfont-family: Consolas, Monaco, 'Andale Mono', 'Ubuntu Mono', monospace;\n" +
            "\ttext-align: left;\n" +
            "\twhite-space: pre;\n" +
            "\tword-spacing: normal;\n" +
            "\tword-break: normal;\n" +
            "\tword-wrap: normal;\n" +
            "\tline-height: 1.5;\n" +
            "\n" +
            "\t-moz-tab-size: 4;\n" +
            "\t-o-tab-size: 4;\n" +
            "\ttab-size: 4;\n" +
            "\n" +
            "\t-webkit-hyphens: none;\n" +
            "\t-moz-hyphens: none;\n" +
            "\t-ms-hyphens: none;\n" +
            "\thyphens: none;\n" +
            "}\n" +
            "\n" +
            "pre[class*=\"language-\"]::-moz-selection, pre[class*=\"language-\"] ::-moz-selection,\n" +
            "code[class*=\"language-\"]::-moz-selection, code[class*=\"language-\"] ::-moz-selection {\n" +
            "\ttext-shadow: none;\n" +
            "\tbackground: #b3d4fc;\n" +
            "}\n" +
            "\n" +
            "pre[class*=\"language-\"]::selection, pre[class*=\"language-\"] ::selection,\n" +
            "code[class*=\"language-\"]::selection, code[class*=\"language-\"] ::selection {\n" +
            "\ttext-shadow: none;\n" +
            "\tbackground: #b3d4fc;\n" +
            "}\n" +
            "\n" +
            "@media print {\n" +
            "\tcode[class*=\"language-\"],\n" +
            "\tpre[class*=\"language-\"] {\n" +
            "\t\ttext-shadow: none;\n" +
            "\t}\n" +
            "}\n" +
            "\n" +
            "/* Code blocks */\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tpadding: 1em;\n" +
            "\tmargin: .5em 0;\n" +
            "\toverflow: auto;\n" +
            "}\n" +
            "\n" +
            ":not(pre) > code[class*=\"language-\"],\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tbackground: #f5f2f0;\n" +
            "}\n" +
            "\n" +
            "/* Inline code */\n" +
            ":not(pre) > code[class*=\"language-\"] {\n" +
            "\tpadding: .1em;\n" +
            "\tborder-radius: .3em;\n" +
            "\twhite-space: normal;\n" +
            "}\n" +
            "\n" +
            ".token.comment,\n" +
            ".token.prolog,\n" +
            ".token.doctype,\n" +
            ".token.cdata {\n" +
            "\tcolor: slategray;\n" +
            "}\n" +
            "\n" +
            ".token.punctuation {\n" +
            "\tcolor: #999;\n" +
            "}\n" +
            "\n" +
            ".namespace {\n" +
            "\topacity: .7;\n" +
            "}\n" +
            "\n" +
            ".token.property,\n" +
            ".token.tag,\n" +
            ".token.boolean,\n" +
            ".token.number,\n" +
            ".token.constant,\n" +
            ".token.symbol,\n" +
            ".token.deleted {\n" +
            "\tcolor: #905;\n" +
            "}\n" +
            "\n" +
            ".token.selector,\n" +
            ".token.attr-name,\n" +
            ".token.string,\n" +
            ".token.char,\n" +
            ".token.builtin,\n" +
            ".token.inserted {\n" +
            "\tcolor: #690;\n" +
            "}\n" +
            "\n" +
            ".token.operator,\n" +
            ".token.entity,\n" +
            ".token.url,\n" +
            ".language-css .token.string,\n" +
            ".style .token.string {\n" +
            "\tcolor: #a67f59;\n" +
            "\tbackground: hsla(0, 0%, 100%, .5);\n" +
            "}\n" +
            "\n" +
            ".token.atrule,\n" +
            ".token.attr-value,\n" +
            ".token.keyword {\n" +
            "\tcolor: #07a;\n" +
            "}\n" +
            "\n" +
            ".token.function {\n" +
            "\tcolor: #DD4A68;\n" +
            "}\n" +
            "\n" +
            ".token.regex,\n" +
            ".token.important,\n" +
            ".token.variable {\n" +
            "\tcolor: #e90;\n" +
            "}\n" +
            "\n" +
            ".token.important,\n" +
            ".token.bold {\n" +
            "\tfont-weight: bold;\n" +
            "}\n" +
            ".token.italic {\n" +
            "\tfont-style: italic;\n" +
            "}\n" +
            "\n" +
            ".token.entity {\n" +
            "\tcursor: help;\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
            "\n" +
            "</head>\n" +
            "\n" +
            "<body>";

    public static final String theme_2 = "<style type=\"text/css\">\n" +
            "html,\n" +
            "body,\n" +
            "h1,\n" +
            "h2,\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6,\n" +
            "p,\n" +
            "blockquote,\n" +
            "ol,\n" +
            "ul,\n" +
            "li,\n" +
            "img {\n" +
            "  margin: 0;\n" +
            "  padding: 0;\n" +
            "  font-size: 100%;\n" +
            "  font: inherit;\n" +
            "  vertical-align: baseline;\n" +
            "}\n" +
            "html * {\n" +
            "  font-family: \"ff-din-web-pro-1\", \"ff-din-web-pro-2\", sans-serif;\n" +
            "  font-size: 16px;\n" +
            "  line-height: 19.2px;\n" +
            "  color-profile: sRGB;\n" +
            "}\n" +
            "body {\n" +
            "  margin: 40px 70px;\n" +
            "}\n" +
            "p {\n" +
            "  font-weight: lighter;\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "strong {\n" +
            "  font-weight: bold;\n" +
            "}\n" +
            "ol,\n" +
            "ul {\n" +
            "  margin-left: 2em;\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "ul ul,\n" +
            "ol ol,\n" +
            "ul ol,\n" +
            "ol ul {\n" +
            "  margin-top: 10px;\n" +
            "}\n" +
            "li {\n" +
            "  margin-bottom: 10px;\n" +
            "}\n" +
            "h1,\n" +
            "h2,\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6 {\n" +
            "  font-weight: lighter;\n" +
            "  text-transform: capitalize;\n" +
            "  margin-top: 40px;\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "h1 {\n" +
            "  font-size: 24.624px;\n" +
            "  line-height: 29.548799999999996px;\n" +
            "}\n" +
            "h2 {\n" +
            "  font-size: 24.624px;\n" +
            "  line-height: 29.548799999999996px;\n" +
            "}\n" +
            "h3 {\n" +
            "  font-size: 23.44px;\n" +
            "  line-height: 28.128px;\n" +
            "}\n" +
            "h4 {\n" +
            "  font-size: 22.16px;\n" +
            "  line-height: 26.592px;\n" +
            "}\n" +
            "h5 {\n" +
            "  font-size: 22.16px;\n" +
            "  line-height: 26.592px;\n" +
            "}\n" +
            "h6 {\n" +
            "  font-size: 22.16px;\n" +
            "  line-height: 26.592px;\n" +
            "}\n" +
            "img {\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "h1 img,\n" +
            "h2 img,\n" +
            "h3 img,\n" +
            "h4 img,\n" +
            "h5 img,\n" +
            "h6 img,\n" +
            "p img {\n" +
            "  margin-bottom: 0;\n" +
            "}\n" +
            "pre {\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "pre,\n" +
            "code {\n" +
            "  font-family: monospace;\n" +
            "}\n" +
            "pre {\n" +
            "  white-space: pre;\n" +
            "  white-space: pre-wrap;\n" +
            "  word-wrap: break-word;\n" +
            "  padding: 15px;\n" +
            "}\n" +
            "blockquote {\n" +
            "  border-left: 4px solid;\n" +
            "  padding: 0 15px;\n" +
            "}\n" +
            "blockquote > :first-child {\n" +
            "  margin-top: 0;\n" +
            "}\n" +
            "blockquote > :last-child {\n" +
            "  margin-bottom: 15px;\n" +
            "}\n" +
            "h1 {\n" +
            "  text-transform: uppercase;\n" +
            "  font-weight: bold;\n" +
            "  border-bottom: 1px solid;\n" +
            "}\n" +
            "h2 {\n" +
            "  border-bottom: 1px solid;\n" +
            "}\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6 {\n" +
            "  border-bottom: none;\n" +
            "}\n" +
            "html * {\n" +
            "  color: #839496;\n" +
            "}\n" +
            "html body {\n" +
            "  background-color: #002b36;\n" +
            "}\n" +
            "html h1,\n" +
            "html h2,\n" +
            "html h3,\n" +
            "html h4,\n" +
            "html h5,\n" +
            "html h6 {\n" +
            "  color: #93a1a1;\n" +
            "  border-color: #839496;\n" +
            "}\n" +
            "html a,\n" +
            "html a:active,\n" +
            "html a:visited {\n" +
            "  color: #93a1a1;\n" +
            "}\n" +
            "html a:hover {\n" +
            "  background-color: #073642;\n" +
            "}\n" +
            "html pre {\n" +
            "  color: #93a1a1;\n" +
            "  background-color: #073642;\n" +
            "}\n" +
            "html a,\n" +
            "html a:active,\n" +
            "html a:visited,\n" +
            "html code.url {\n" +
            "  color: #b58900;\n" +
            "}\n" +
            "html h1 {\n" +
            "  color: #b58900;\n" +
            "}\n" +
            "html h2,\n" +
            "html h3,\n" +
            "html h4,\n" +
            "html h5,\n" +
            "html h6 {\n" +
            "  color: #b58900;\n" +
            "}\n" +
            "kbd {\n" +
            "  display: inline-block;\n" +
            "  padding: 3px 5px;\n" +
            "  font-size: 11px;\n" +
            "  line-height: 10px;\n" +
            "  color: #555;\n" +
            "  vertical-align: middle;\n" +
            "  background-color: #fcfcfc;\n" +
            "  border: solid 1px #ccc;\n" +
            "  border-bottom-color: #bbb;\n" +
            "  border-radius: 3px;\n" +
            "  box-shadow: inset 0 -1px 0 #bbb;\n" +
            "}\n" +
            "\n" +
            "@media print {\n" +
            "  body {\n" +
            "    margin: 0;\n" +
            "  }\n" +
            "  * {\n" +
            "    color: #000 !important;\n" +
            "  }\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
            "<style type=\"text/css\">\n" +
            "/**\n" +
            " * prism.js default theme for JavaScript, CSS and HTML\n" +
            " * Based on dabblet (http://dabblet.com)\n" +
            " * @author Lea Verou\n" +
            " */\n" +
            "\n" +
            "code[class*=\"language-\"],\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tcolor: black;\n" +
            "\tbackground: none;\n" +
            "\ttext-shadow: 0 1px white;\n" +
            "\tfont-family: Consolas, Monaco, 'Andale Mono', 'Ubuntu Mono', monospace;\n" +
            "\ttext-align: left;\n" +
            "\twhite-space: pre;\n" +
            "\tword-spacing: normal;\n" +
            "\tword-break: normal;\n" +
            "\tword-wrap: normal;\n" +
            "\tline-height: 1.5;\n" +
            "\n" +
            "\t-moz-tab-size: 4;\n" +
            "\t-o-tab-size: 4;\n" +
            "\ttab-size: 4;\n" +
            "\n" +
            "\t-webkit-hyphens: none;\n" +
            "\t-moz-hyphens: none;\n" +
            "\t-ms-hyphens: none;\n" +
            "\thyphens: none;\n" +
            "}\n" +
            "\n" +
            "pre[class*=\"language-\"]::-moz-selection, pre[class*=\"language-\"] ::-moz-selection,\n" +
            "code[class*=\"language-\"]::-moz-selection, code[class*=\"language-\"] ::-moz-selection {\n" +
            "\ttext-shadow: none;\n" +
            "\tbackground: #b3d4fc;\n" +
            "}\n" +
            "\n" +
            "pre[class*=\"language-\"]::selection, pre[class*=\"language-\"] ::selection,\n" +
            "code[class*=\"language-\"]::selection, code[class*=\"language-\"] ::selection {\n" +
            "\ttext-shadow: none;\n" +
            "\tbackground: #b3d4fc;\n" +
            "}\n" +
            "\n" +
            "@media print {\n" +
            "\tcode[class*=\"language-\"],\n" +
            "\tpre[class*=\"language-\"] {\n" +
            "\t\ttext-shadow: none;\n" +
            "\t}\n" +
            "}\n" +
            "\n" +
            "/* Code blocks */\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tpadding: 1em;\n" +
            "\tmargin: .5em 0;\n" +
            "\toverflow: auto;\n" +
            "}\n" +
            "\n" +
            ":not(pre) > code[class*=\"language-\"],\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tbackground: #f5f2f0;\n" +
            "}\n" +
            "\n" +
            "/* Inline code */\n" +
            ":not(pre) > code[class*=\"language-\"] {\n" +
            "\tpadding: .1em;\n" +
            "\tborder-radius: .3em;\n" +
            "\twhite-space: normal;\n" +
            "}\n" +
            "\n" +
            ".token.comment,\n" +
            ".token.prolog,\n" +
            ".token.doctype,\n" +
            ".token.cdata {\n" +
            "\tcolor: slategray;\n" +
            "}\n" +
            "\n" +
            ".token.punctuation {\n" +
            "\tcolor: #999;\n" +
            "}\n" +
            "\n" +
            ".namespace {\n" +
            "\topacity: .7;\n" +
            "}\n" +
            "\n" +
            ".token.property,\n" +
            ".token.tag,\n" +
            ".token.boolean,\n" +
            ".token.number,\n" +
            ".token.constant,\n" +
            ".token.symbol,\n" +
            ".token.deleted {\n" +
            "\tcolor: #905;\n" +
            "}\n" +
            "\n" +
            ".token.selector,\n" +
            ".token.attr-name,\n" +
            ".token.string,\n" +
            ".token.char,\n" +
            ".token.builtin,\n" +
            ".token.inserted {\n" +
            "\tcolor: #690;\n" +
            "}\n" +
            "\n" +
            ".token.operator,\n" +
            ".token.entity,\n" +
            ".token.url,\n" +
            ".language-css .token.string,\n" +
            ".style .token.string {\n" +
            "\tcolor: #a67f59;\n" +
            "\tbackground: hsla(0, 0%, 100%, .5);\n" +
            "}\n" +
            "\n" +
            ".token.atrule,\n" +
            ".token.attr-value,\n" +
            ".token.keyword {\n" +
            "\tcolor: #07a;\n" +
            "}\n" +
            "\n" +
            ".token.function {\n" +
            "\tcolor: #DD4A68;\n" +
            "}\n" +
            "\n" +
            ".token.regex,\n" +
            ".token.important,\n" +
            ".token.variable {\n" +
            "\tcolor: #e90;\n" +
            "}\n" +
            "\n" +
            ".token.important,\n" +
            ".token.bold {\n" +
            "\tfont-weight: bold;\n" +
            "}\n" +
            ".token.italic {\n" +
            "\tfont-style: italic;\n" +
            "}\n" +
            "\n" +
            ".token.entity {\n" +
            "\tcursor: help;\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
            "\n" +
            "</head>\n" +
            "\n" +
            "<body>";

    public static final String theme_22 = "<style type=\"text/css\">\n" +
            "html,\n" +
            "body,\n" +
            "h1,\n" +
            "h2,\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6,\n" +
            "p,\n" +
            "blockquote,\n" +
            "ol,\n" +
            "ul,\n" +
            "li,\n" +
            "img {\n" +
            "  margin: 0;\n" +
            "  padding: 0;\n" +
            "  font-size: 100%;\n" +
            "  font: inherit;\n" +
            "  vertical-align: baseline;\n" +
            "}\n" +
            "html * {\n" +
            "  font-family: \"ff-din-web-pro-1\", \"ff-din-web-pro-2\", sans-serif;\n" +
            "  font-size: 16px;\n" +
            "  line-height: 19.2px;\n" +
            "  color-profile: sRGB;\n" +
            "}\n" +
            "body {\n" +
            "  margin: 40px 70px;\n" +
            "}\n" +
            "p {\n" +
            "  font-weight: lighter;\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "strong {\n" +
            "  font-weight: bold;\n" +
            "}\n" +
            "ol,\n" +
            "ul {\n" +
            "  margin-left: 2em;\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "ul ul,\n" +
            "ol ol,\n" +
            "ul ol,\n" +
            "ol ul {\n" +
            "  margin-top: 10px;\n" +
            "}\n" +
            "li {\n" +
            "  margin-bottom: 10px;\n" +
            "}\n" +
            "h1,\n" +
            "h2,\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6 {\n" +
            "  font-weight: lighter;\n" +
            "  text-transform: capitalize;\n" +
            "  margin-top: 40px;\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "h1 {\n" +
            "  font-size: 24.624px;\n" +
            "  line-height: 29.548799999999996px;\n" +
            "}\n" +
            "h2 {\n" +
            "  font-size: 24.624px;\n" +
            "  line-height: 29.548799999999996px;\n" +
            "}\n" +
            "h3 {\n" +
            "  font-size: 23.44px;\n" +
            "  line-height: 28.128px;\n" +
            "}\n" +
            "h4 {\n" +
            "  font-size: 22.16px;\n" +
            "  line-height: 26.592px;\n" +
            "}\n" +
            "h5 {\n" +
            "  font-size: 22.16px;\n" +
            "  line-height: 26.592px;\n" +
            "}\n" +
            "h6 {\n" +
            "  font-size: 22.16px;\n" +
            "  line-height: 26.592px;\n" +
            "}\n" +
            "img {\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "h1 img,\n" +
            "h2 img,\n" +
            "h3 img,\n" +
            "h4 img,\n" +
            "h5 img,\n" +
            "h6 img,\n" +
            "p img {\n" +
            "  margin-bottom: 0;\n" +
            "}\n" +
            "pre {\n" +
            "  margin-bottom: 20px;\n" +
            "}\n" +
            "pre,\n" +
            "code {\n" +
            "  font-family: monospace;\n" +
            "}\n" +
            "pre {\n" +
            "  white-space: pre;\n" +
            "  white-space: pre-wrap;\n" +
            "  word-wrap: break-word;\n" +
            "  padding: 15px;\n" +
            "}\n" +
            "blockquote {\n" +
            "  border-left: 4px solid;\n" +
            "  padding: 0 15px;\n" +
            "}\n" +
            "blockquote > :first-child {\n" +
            "  margin-top: 0;\n" +
            "}\n" +
            "blockquote > :last-child {\n" +
            "  margin-bottom: 15px;\n" +
            "}\n" +
            "h1 {\n" +
            "  text-transform: uppercase;\n" +
            "  font-weight: bold;\n" +
            "  border-bottom: 1px solid;\n" +
            "}\n" +
            "h2 {\n" +
            "  border-bottom: 1px solid;\n" +
            "}\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6 {\n" +
            "  border-bottom: none;\n" +
            "}\n" +
            "html * {\n" +
            "  color: #839496;\n" +
            "}\n" +
            "html body {\n" +
            "  background-color: white;\n" +
            "}\n" +
            "html h1,\n" +
            "html h2,\n" +
            "html h3,\n" +
            "html h4,\n" +
            "html h5,\n" +
            "html h6 {\n" +
            "  color: #93a1a1;\n" +
            "  border-color: #839496;\n" +
            "}\n" +
            "html a,\n" +
            "html a:active,\n" +
            "html a:visited {\n" +
            "  color: #93a1a1;\n" +
            "}\n" +
            "html a:hover {\n" +
            "  background-color: #073642;\n" +
            "}\n" +
            "html pre {\n" +
            "  color: #93a1a1;\n" +
            "  background-color: #073642;\n" +
            "}\n" +
            "html a,\n" +
            "html a:active,\n" +
            "html a:visited,\n" +
            "html code.url {\n" +
            "  color: #b58900;\n" +
            "}\n" +
            "html h1 {\n" +
            "  color: #b58900;\n" +
            "}\n" +
            "html h2,\n" +
            "html h3,\n" +
            "html h4,\n" +
            "html h5,\n" +
            "html h6 {\n" +
            "  color: #b58900;\n" +
            "}\n" +
            "kbd {\n" +
            "  display: inline-block;\n" +
            "  padding: 3px 5px;\n" +
            "  font-size: 11px;\n" +
            "  line-height: 10px;\n" +
            "  color: #555;\n" +
            "  vertical-align: middle;\n" +
            "  background-color: #fcfcfc;\n" +
            "  border: solid 1px #ccc;\n" +
            "  border-bottom-color: #bbb;\n" +
            "  border-radius: 3px;\n" +
            "  box-shadow: inset 0 -1px 0 #bbb;\n" +
            "}\n" +
            "\n" +
            "@media print {\n" +
            "  body {\n" +
            "    margin: 0;\n" +
            "  }\n" +
            "  * {\n" +
            "    color: #000 !important;\n" +
            "  }\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
            "<style type=\"text/css\">\n" +
            "/**\n" +
            " * prism.js default theme for JavaScript, CSS and HTML\n" +
            " * Based on dabblet (http://dabblet.com)\n" +
            " * @author Lea Verou\n" +
            " */\n" +
            "\n" +
            "code[class*=\"language-\"],\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tcolor: black;\n" +
            "\tbackground: none;\n" +
            "\ttext-shadow: 0 1px white;\n" +
            "\tfont-family: Consolas, Monaco, 'Andale Mono', 'Ubuntu Mono', monospace;\n" +
            "\ttext-align: left;\n" +
            "\twhite-space: pre;\n" +
            "\tword-spacing: normal;\n" +
            "\tword-break: normal;\n" +
            "\tword-wrap: normal;\n" +
            "\tline-height: 1.5;\n" +
            "\n" +
            "\t-moz-tab-size: 4;\n" +
            "\t-o-tab-size: 4;\n" +
            "\ttab-size: 4;\n" +
            "\n" +
            "\t-webkit-hyphens: none;\n" +
            "\t-moz-hyphens: none;\n" +
            "\t-ms-hyphens: none;\n" +
            "\thyphens: none;\n" +
            "}\n" +
            "\n" +
            "pre[class*=\"language-\"]::-moz-selection, pre[class*=\"language-\"] ::-moz-selection,\n" +
            "code[class*=\"language-\"]::-moz-selection, code[class*=\"language-\"] ::-moz-selection {\n" +
            "\ttext-shadow: none;\n" +
            "\tbackground: #b3d4fc;\n" +
            "}\n" +
            "\n" +
            "pre[class*=\"language-\"]::selection, pre[class*=\"language-\"] ::selection,\n" +
            "code[class*=\"language-\"]::selection, code[class*=\"language-\"] ::selection {\n" +
            "\ttext-shadow: none;\n" +
            "\tbackground: #b3d4fc;\n" +
            "}\n" +
            "\n" +
            "@media print {\n" +
            "\tcode[class*=\"language-\"],\n" +
            "\tpre[class*=\"language-\"] {\n" +
            "\t\ttext-shadow: none;\n" +
            "\t}\n" +
            "}\n" +
            "\n" +
            "/* Code blocks */\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tpadding: 1em;\n" +
            "\tmargin: .5em 0;\n" +
            "\toverflow: auto;\n" +
            "}\n" +
            "\n" +
            ":not(pre) > code[class*=\"language-\"],\n" +
            "pre[class*=\"language-\"] {\n" +
            "\tbackground: #f5f2f0;\n" +
            "}\n" +
            "\n" +
            "/* Inline code */\n" +
            ":not(pre) > code[class*=\"language-\"] {\n" +
            "\tpadding: .1em;\n" +
            "\tborder-radius: .3em;\n" +
            "\twhite-space: normal;\n" +
            "}\n" +
            "\n" +
            ".token.comment,\n" +
            ".token.prolog,\n" +
            ".token.doctype,\n" +
            ".token.cdata {\n" +
            "\tcolor: slategray;\n" +
            "}\n" +
            "\n" +
            ".token.punctuation {\n" +
            "\tcolor: #999;\n" +
            "}\n" +
            "\n" +
            ".namespace {\n" +
            "\topacity: .7;\n" +
            "}\n" +
            "\n" +
            ".token.property,\n" +
            ".token.tag,\n" +
            ".token.boolean,\n" +
            ".token.number,\n" +
            ".token.constant,\n" +
            ".token.symbol,\n" +
            ".token.deleted {\n" +
            "\tcolor: #905;\n" +
            "}\n" +
            "\n" +
            ".token.selector,\n" +
            ".token.attr-name,\n" +
            ".token.string,\n" +
            ".token.char,\n" +
            ".token.builtin,\n" +
            ".token.inserted {\n" +
            "\tcolor: #690;\n" +
            "}\n" +
            "\n" +
            ".token.operator,\n" +
            ".token.entity,\n" +
            ".token.url,\n" +
            ".language-css .token.string,\n" +
            ".style .token.string {\n" +
            "\tcolor: #a67f59;\n" +
            "\tbackground: hsla(0, 0%, 100%, .5);\n" +
            "}\n" +
            "\n" +
            ".token.atrule,\n" +
            ".token.attr-value,\n" +
            ".token.keyword {\n" +
            "\tcolor: #07a;\n" +
            "}\n" +
            "\n" +
            ".token.function {\n" +
            "\tcolor: #DD4A68;\n" +
            "}\n" +
            "\n" +
            ".token.regex,\n" +
            ".token.important,\n" +
            ".token.variable {\n" +
            "\tcolor: #e90;\n" +
            "}\n" +
            "\n" +
            ".token.important,\n" +
            ".token.bold {\n" +
            "\tfont-weight: bold;\n" +
            "}\n" +
            ".token.italic {\n" +
            "\tfont-style: italic;\n" +
            "}\n" +
            "\n" +
            ".token.entity {\n" +
            "\tcursor: help;\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
            "\n" +
            "</head>\n" +
            "\n" +
            "<body>";

    public static final String new_theme_1 = "body {\n" +
            "  font-family: Helvetica, arial, sans-serif;\n" +
            "  font-size: 14px;\n" +
            "  line-height: 1.6;\n" +
            "  padding-top: 10px;\n" +
            "  padding-bottom: 10px;\n" +
            "  background-color: white;\n" +
            "  padding: 30px; }\n" +
            "\n" +
            "body > *:first-child {\n" +
            "  margin-top: 0 !important; }\n" +
            "body > *:last-child {\n" +
            "  margin-bottom: 0 !important; }\n" +
            "\n" +
            "a {\n" +
            "  color: #4183C4; }\n" +
            "a.absent {\n" +
            "  color: #cc0000; }\n" +
            "a.anchor {\n" +
            "  display: block;\n" +
            "  padding-left: 30px;\n" +
            "  margin-left: -30px;\n" +
            "  cursor: pointer;\n" +
            "  position: absolute;\n" +
            "  top: 0;\n" +
            "  left: 0;\n" +
            "  bottom: 0; }\n" +
            "\n" +
            "h1, h2, h3, h4, h5, h6 {\n" +
            "  margin: 20px 0 10px;\n" +
            "  padding: 0;\n" +
            "  font-weight: bold;\n" +
            "  -webkit-font-smoothing: antialiased;\n" +
            "  cursor: text;\n" +
            "  position: relative; }\n" +
            "\n" +
            "h1:hover a.anchor, h2:hover a.anchor, h3:hover a.anchor, h4:hover a.anchor, h5:hover a.anchor, h6:hover a.anchor {\n" +
            "  background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA09pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoMTMuMCAyMDEyMDMwNS5tLjQxNSAyMDEyLzAzLzA1OjIxOjAwOjAwKSAgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6OUM2NjlDQjI4ODBGMTFFMTg1ODlEODNERDJBRjUwQTQiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6OUM2NjlDQjM4ODBGMTFFMTg1ODlEODNERDJBRjUwQTQiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo5QzY2OUNCMDg4MEYxMUUxODU4OUQ4M0REMkFGNTBBNCIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo5QzY2OUNCMTg4MEYxMUUxODU4OUQ4M0REMkFGNTBBNCIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PsQhXeAAAABfSURBVHjaYvz//z8DJYCRUgMYQAbAMBQIAvEqkBQWXI6sHqwHiwG70TTBxGaiWwjCTGgOUgJiF1J8wMRAIUA34B4Q76HUBelAfJYSA0CuMIEaRP8wGIkGMA54bgQIMACAmkXJi0hKJQAAAABJRU5ErkJggg==) no-repeat 10px center;\n" +
            "  text-decoration: none; }\n" +
            "\n" +
            "h1 tt, h1 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h2 tt, h2 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h3 tt, h3 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h4 tt, h4 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h5 tt, h5 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h6 tt, h6 code {\n" +
            "  font-size: inherit; }\n" +
            "\n" +
            "h1 {\n" +
            "  font-size: 28px;\n" +
            "  color: black; }\n" +
            "\n" +
            "h2 {\n" +
            "  font-size: 24px;\n" +
            "  border-bottom: 1px solid #cccccc;\n" +
            "  color: black; }\n" +
            "\n" +
            "h3 {\n" +
            "  font-size: 18px; }\n" +
            "\n" +
            "h4 {\n" +
            "  font-size: 16px; }\n" +
            "\n" +
            "h5 {\n" +
            "  font-size: 14px; }\n" +
            "\n" +
            "h6 {\n" +
            "  color: #777777;\n" +
            "  font-size: 14px; }\n" +
            "\n" +
            "p, blockquote, ul, ol, dl, li, table, pre {\n" +
            "  margin: 15px 0; }\n" +
            "\n" +
            "hr {\n" +
            "  background: transparent url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAAECAYAAACtBE5DAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBNYWNpbnRvc2giIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6OENDRjNBN0E2NTZBMTFFMEI3QjRBODM4NzJDMjlGNDgiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6OENDRjNBN0I2NTZBMTFFMEI3QjRBODM4NzJDMjlGNDgiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo4Q0NGM0E3ODY1NkExMUUwQjdCNEE4Mzg3MkMyOUY0OCIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo4Q0NGM0E3OTY1NkExMUUwQjdCNEE4Mzg3MkMyOUY0OCIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PqqezsUAAAAfSURBVHjaYmRABcYwBiM2QSA4y4hNEKYDQxAEAAIMAHNGAzhkPOlYAAAAAElFTkSuQmCC) repeat-x 0 0;\n" +
            "  border: 0 none;\n" +
            "  color: #cccccc;\n" +
            "  height: 4px;\n" +
            "  padding: 0;\n" +
            "}\n" +
            "\n" +
            "body > h2:first-child {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "body > h1:first-child {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "  body > h1:first-child + h2 {\n" +
            "    margin-top: 0;\n" +
            "    padding-top: 0; }\n" +
            "body > h3:first-child, body > h4:first-child, body > h5:first-child, body > h6:first-child {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "\n" +
            "a:first-child h1, a:first-child h2, a:first-child h3, a:first-child h4, a:first-child h5, a:first-child h6 {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "\n" +
            "h1 p, h2 p, h3 p, h4 p, h5 p, h6 p {\n" +
            "  margin-top: 0; }\n" +
            "\n" +
            "li p.first {\n" +
            "  display: inline-block; }\n" +
            "li {\n" +
            "  margin: 0; }\n" +
            "ul, ol {\n" +
            "  padding-left: 30px; }\n" +
            "\n" +
            "ul :first-child, ol :first-child {\n" +
            "  margin-top: 0; }\n" +
            "\n" +
            "dl {\n" +
            "  padding: 0; }\n" +
            "  dl dt {\n" +
            "    font-size: 14px;\n" +
            "    font-weight: bold;\n" +
            "    font-style: italic;\n" +
            "    padding: 0;\n" +
            "    margin: 15px 0 5px; }\n" +
            "    dl dt:first-child {\n" +
            "      padding: 0; }\n" +
            "    dl dt > :first-child {\n" +
            "      margin-top: 0; }\n" +
            "    dl dt > :last-child {\n" +
            "      margin-bottom: 0; }\n" +
            "  dl dd {\n" +
            "    margin: 0 0 15px;\n" +
            "    padding: 0 15px; }\n" +
            "    dl dd > :first-child {\n" +
            "      margin-top: 0; }\n" +
            "    dl dd > :last-child {\n" +
            "      margin-bottom: 0; }\n" +
            "\n" +
            "blockquote {\n" +
            "  border-left: 4px solid #dddddd;\n" +
            "  padding: 0 15px;\n" +
            "  color: #777777; }\n" +
            "  blockquote > :first-child {\n" +
            "    margin-top: 0; }\n" +
            "  blockquote > :last-child {\n" +
            "    margin-bottom: 0; }\n" +
            "\n" +
            "table {\n" +
            "  padding: 0;border-collapse: collapse; }\n" +
            "  table tr {\n" +
            "    border-top: 1px solid #cccccc;\n" +
            "    background-color: white;\n" +
            "    margin: 0;\n" +
            "    padding: 0; }\n" +
            "    table tr:nth-child(2n) {\n" +
            "      background-color: #f8f8f8; }\n" +
            "    table tr th {\n" +
            "      font-weight: bold;\n" +
            "      border: 1px solid #cccccc;\n" +
            "      margin: 0;\n" +
            "      padding: 6px 13px; }\n" +
            "    table tr td {\n" +
            "      border: 1px solid #cccccc;\n" +
            "      margin: 0;\n" +
            "      padding: 6px 13px; }\n" +
            "    table tr th :first-child, table tr td :first-child {\n" +
            "      margin-top: 0; }\n" +
            "    table tr th :last-child, table tr td :last-child {\n" +
            "      margin-bottom: 0; }\n" +
            "\n" +
            "img {\n" +
            "  max-width: 100%; }\n" +
            "\n" +
            "span.frame {\n" +
            "  display: block;\n" +
            "  overflow: hidden; }\n" +
            "  span.frame > span {\n" +
            "    border: 1px solid #dddddd;\n" +
            "    display: block;\n" +
            "    float: left;\n" +
            "    overflow: hidden;\n" +
            "    margin: 13px 0 0;\n" +
            "    padding: 7px;\n" +
            "    width: auto; }\n" +
            "  span.frame span img {\n" +
            "    display: block;\n" +
            "    float: left; }\n" +
            "  span.frame span span {\n" +
            "    clear: both;\n" +
            "    color: #333333;\n" +
            "    display: block;\n" +
            "    padding: 5px 0 0; }\n" +
            "span.align-center {\n" +
            "  display: block;\n" +
            "  overflow: hidden;\n" +
            "  clear: both; }\n" +
            "  span.align-center > span {\n" +
            "    display: block;\n" +
            "    overflow: hidden;\n" +
            "    margin: 13px auto 0;\n" +
            "    text-align: center; }\n" +
            "  span.align-center span img {\n" +
            "    margin: 0 auto;\n" +
            "    text-align: center; }\n" +
            "span.align-right {\n" +
            "  display: block;\n" +
            "  overflow: hidden;\n" +
            "  clear: both; }\n" +
            "  span.align-right > span {\n" +
            "    display: block;\n" +
            "    overflow: hidden;\n" +
            "    margin: 13px 0 0;\n" +
            "    text-align: right; }\n" +
            "  span.align-right span img {\n" +
            "    margin: 0;\n" +
            "    text-align: right; }\n" +
            "span.float-left {\n" +
            "  display: block;\n" +
            "  margin-right: 13px;\n" +
            "  overflow: hidden;\n" +
            "  float: left; }\n" +
            "  span.float-left span {\n" +
            "    margin: 13px 0 0; }\n" +
            "span.float-right {\n" +
            "  display: block;\n" +
            "  margin-left: 13px;\n" +
            "  overflow: hidden;\n" +
            "  float: right; }\n" +
            "  span.float-right > span {\n" +
            "    display: block;\n" +
            "    overflow: hidden;\n" +
            "    margin: 13px auto 0;\n" +
            "    text-align: right; }\n" +
            "\n" +
            "code, tt {\n" +
            "  margin: 0 2px;\n" +
            "  padding: 0 5px;\n" +
            "  white-space: nowrap;\n" +
            "  border: 1px solid #eaeaea;\n" +
            "  background-color: #f8f8f8;\n" +
            "  border-radius: 3px; }\n" +
            "\n" +
            "pre code {\n" +
            "  margin: 0;\n" +
            "  padding: 0;\n" +
            "  white-space: pre;\n" +
            "  border: none;\n" +
            "  background: transparent; }\n" +
            "\n" +
            ".highlight pre {\n" +
            "  background-color: #f8f8f8;\n" +
            "  border: 1px solid #cccccc;\n" +
            "  font-size: 13px;\n" +
            "  line-height: 19px;\n" +
            "  overflow: auto;\n" +
            "  padding: 6px 10px;\n" +
            "  border-radius: 3px; }\n" +
            "\n" +
            "pre {\n" +
            "  background-color: #f8f8f8;\n" +
            "  border: 1px solid #cccccc;\n" +
            "  font-size: 13px;\n" +
            "  line-height: 19px;\n" +
            "  overflow: auto;\n" +
            "  padding: 6px 10px;\n" +
            "  border-radius: 3px; }\n" +
            "  pre code, pre tt {\n" +
            "    background-color: transparent;\n" +
            "    border: none; }\n" +
            "\n" +
            "sup {\n" +
            "    font-size: 0.83em;\n" +
            "    vertical-align: super;\n" +
            "    line-height: 0;\n" +
            "}\n" +
            "\n" +
            "kbd {\n" +
            "  display: inline-block;\n" +
            "  padding: 3px 5px;\n" +
            "  font-size: 11px;\n" +
            "  line-height: 10px;\n" +
            "  color: #555;\n" +
            "  vertical-align: middle;\n" +
            "  background-color: #fcfcfc;\n" +
            "  border: solid 1px #ccc;\n" +
            "  border-bottom-color: #bbb;\n" +
            "  border-radius: 3px;\n" +
            "  box-shadow: inset 0 -1px 0 #bbb\n" +
            "}\n" +
            "\n" +
            "* {\n" +
            "\t-webkit-print-color-adjust: exact;\n" +
            "}\n" +
            "@media screen and (min-width: 914px) {\n" +
            "    body {\n" +
            "        width: 854px;\n" +
            "        margin:0 auto;\n" +
            "    }\n" +
            "}\n" +
            "@media print {\n" +
            "\ttable, pre {\n" +
            "\t\tpage-break-inside: avoid;\n" +
            "\t}\n" +
            "\tpre {\n" +
            "\t\tword-wrap: break-word;\n" +
            "\t}\n" +
            "}\n";

    public static final String new_theme_3 = "h1,\n" +
            "h2,\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6,\n" +
            "p,\n" +
            "blockquote {\n" +
            "    margin: 0;\n" +
            "    padding: 0;\n" +
            "}\n" +
            "body {\n" +
            "    font-family: \"Helvetica Neue\", Helvetica, \"Hiragino Sans GB\", Arial, sans-serif;\n" +
            "    font-size: 13px;\n" +
            "    line-height: 18px;\n" +
            "    color: #737373;\n" +
            "    background-color: white;\n" +
            "    margin: 10px 13px 10px 13px;\n" +
            "}\n" +
            "table {\n" +
            "\tmargin: 10px 0 15px 0;\n" +
            "\tborder-collapse: collapse;\n" +
            "}\n" +
            "td,th {\n" +
            "\tborder: 1px solid #ddd;\n" +
            "\tpadding: 3px 10px;\n" +
            "}\n" +
            "th {\n" +
            "\tpadding: 5px 10px;\n" +
            "}\n" +
            "\n" +
            "a {\n" +
            "    color: #0069d6;\n" +
            "}\n" +
            "a:hover {\n" +
            "    color: #0050a3;\n" +
            "    text-decoration: none;\n" +
            "}\n" +
            "a img {\n" +
            "    border: none;\n" +
            "}\n" +
            "p {\n" +
            "    margin-bottom: 9px;\n" +
            "}\n" +
            "h1,\n" +
            "h2,\n" +
            "h3,\n" +
            "h4,\n" +
            "h5,\n" +
            "h6 {\n" +
            "    color: #404040;\n" +
            "    line-height: 36px;\n" +
            "}\n" +
            "h1 {\n" +
            "    margin-bottom: 18px;\n" +
            "    font-size: 30px;\n" +
            "}\n" +
            "h2 {\n" +
            "    font-size: 24px;\n" +
            "}\n" +
            "h3 {\n" +
            "    font-size: 18px;\n" +
            "}\n" +
            "h4 {\n" +
            "    font-size: 16px;\n" +
            "}\n" +
            "h5 {\n" +
            "    font-size: 14px;\n" +
            "}\n" +
            "h6 {\n" +
            "    font-size: 13px;\n" +
            "}\n" +
            "hr {\n" +
            "    margin: 0 0 19px;\n" +
            "    border: 0;\n" +
            "    border-bottom: 1px solid #ccc;\n" +
            "}\n" +
            "blockquote {\n" +
            "    padding: 13px 13px 21px 15px;\n" +
            "    margin-bottom: 18px;\n" +
            "    font-family:georgia,serif;\n" +
            "    font-style: italic;\n" +
            "}\n" +
            "blockquote:before {\n" +
            "    content:\"\\201C\";\n" +
            "    font-size:40px;\n" +
            "    margin-left:-10px;\n" +
            "    font-family:georgia,serif;\n" +
            "    color:#eee;\n" +
            "}\n" +
            "blockquote p {\n" +
            "    font-size: 14px;\n" +
            "    font-weight: 300;\n" +
            "    line-height: 18px;\n" +
            "    margin-bottom: 0;\n" +
            "    font-style: italic;\n" +
            "}\n" +
            "code, pre {\n" +
            "    font-family: Monaco, Andale Mono, Courier New, monospace;\n" +
            "}\n" +
            "code {\n" +
            "    background-color: #fee9cc;\n" +
            "    color: rgba(0, 0, 0, 0.75);\n" +
            "    padding: 1px 3px;\n" +
            "    font-size: 12px;\n" +
            "    -webkit-border-radius: 3px;\n" +
            "    -moz-border-radius: 3px;\n" +
            "    border-radius: 3px;\n" +
            "}\n" +
            "pre {\n" +
            "    display: block;\n" +
            "    padding: 14px;\n" +
            "    margin: 0 0 18px;\n" +
            "    line-height: 16px;\n" +
            "    font-size: 11px;\n" +
            "    border: 1px solid #d9d9d9;\n" +
            "    white-space: pre-wrap;\n" +
            "    word-wrap: break-word;\n" +
            "}\n" +
            "pre code {\n" +
            "    background-color: #fff;\n" +
            "    color:#737373;\n" +
            "    font-size: 11px;\n" +
            "    padding: 0;\n" +
            "}\n" +
            "sup {\n" +
            "    font-size: 0.83em;\n" +
            "    vertical-align: super;\n" +
            "    line-height: 0;\n" +
            "}\n" +
            "kbd {\n" +
            "  display: inline-block;\n" +
            "  padding: 3px 5px;\n" +
            "  font-size: 11px;\n" +
            "  line-height: 10px;\n" +
            "  color: #555;\n" +
            "  vertical-align: middle;\n" +
            "  background-color: #fcfcfc;\n" +
            "  border: solid 1px #ccc;\n" +
            "  border-bottom-color: #bbb;\n" +
            "  border-radius: 3px;\n" +
            "  box-shadow: inset 0 -1px 0 #bbb;\n" +
            "}\n" +
            "* {\n" +
            "\t-webkit-print-color-adjust: exact;\n" +
            "}\n" +
            "@media screen and (min-width: 914px) {\n" +
            "    body {\n" +
            "        width: 854px;\n" +
            "        margin:10px auto;\n" +
            "    }\n" +
            "}\n" +
            "@media print {\n" +
            "\tbody,code,pre code,h1,h2,h3,h4,h5,h6 {\n" +
            "\t\tcolor: black;\n" +
            "\t}\n" +
            "\ttable, pre {\n" +
            "\t\tpage-break-inside: avoid;\n" +
            "\t}\n" +
            "}\n";

    public static void loadCssTheme(){
        // 加载 css 主题
        map.put("theme_1",new_theme_1);
        map.put("theme_2",new_theme_3);
    }

    public static String getTheme(String themeName){
        loadCssTheme();
        return map.get(themeName);
    }
}

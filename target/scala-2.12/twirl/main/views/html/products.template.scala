
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /* Parameters */
  def apply/*2.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.34*/("""

"""),format.raw/*4.1*/("""<!-- Pass page title and content """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""html between braces"""),format.raw/*4.54*/("""}"""),format.raw/*4.55*/(""" """),format.raw/*4.56*/("""to the main view -->
"""),_display_(/*5.2*/main("Products")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""
  """),format.raw/*6.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">

        """),format.raw/*15.73*/("""
        """),_display_(/*16.10*/if(flash.containsKey("success"))/*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
          """),format.raw/*17.11*/("""<div class="alert alert-success">
            """),_display_(/*18.14*/flash/*18.19*/.get("success")),format.raw/*18.34*/("""
          """),format.raw/*19.11*/("""</div>
        """)))}),format.raw/*20.10*/("""

        """),format.raw/*22.9*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
            <th></th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
            """),format.raw/*36.36*/("""
            """),format.raw/*37.77*/("""

            """),_display_(/*39.14*/for(p <- products) yield /*39.32*/ {_display_(Seq[Any](format.raw/*39.34*/("""
            """),format.raw/*40.13*/("""<tr>
              <td>"""),_display_(/*41.20*/p/*41.21*/.getId),format.raw/*41.27*/("""</td>
              <td>"""),_display_(/*42.20*/p/*42.21*/.getName),format.raw/*42.29*/("""</td>
              <td>"""),_display_(/*43.20*/p/*43.21*/.getDescription),format.raw/*43.36*/("""</td>
              <td>"""),_display_(/*44.20*/p/*44.21*/.getStock),format.raw/*44.30*/("""</td>
              <td>&euro; """),_display_(/*45.27*/("%.2f".format(p.getPrice))),format.raw/*45.54*/("""</td>
              <!-- Delete product button -->
              <td>
                <a href=""""),_display_(/*48.27*/routes/*48.33*/.HomeController.deleteProduct(p.getId)),format.raw/*48.71*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                  <span class="glyphicon glyphicon-trash"></span>
                </a>
              </td>
            </tr>
          """)))}),format.raw/*53.12*/(""" """),format.raw/*53.30*/("""
          """),format.raw/*54.11*/("""</tbody>
        </table>
        <hr>
        <p>
          <a href=""""),_display_(/*58.21*/routes/*58.27*/.HomeController.addProduct),format.raw/*58.53*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 15:29:51 IST 2017
                  SOURCE: /home/wdd/webapps/playapps/playLab2017_crud-part3-delete/app/views/products.scala.html
                  HASH: 9e17e5e811ab5939e8ef86405990d0523bdfe440
                  MATRIX: 977->18|1104->50|1132->52|1192->85|1220->86|1266->105|1294->106|1322->107|1369->129|1393->145|1432->147|1461->150|1703->428|1740->438|1781->470|1821->472|1860->483|1934->530|1948->535|1984->550|2023->561|2070->577|2107->587|2526->1001|2567->1078|2609->1093|2643->1111|2683->1113|2724->1126|2775->1150|2785->1151|2812->1157|2864->1182|2874->1183|2903->1191|2955->1216|2965->1217|3001->1232|3053->1257|3063->1258|3093->1267|3152->1299|3200->1326|3323->1422|3338->1428|3397->1466|3627->1665|3656->1683|3695->1694|3793->1765|3808->1771|3855->1797
                  LINES: 28->2|33->2|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|53->22|67->36|68->37|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|79->48|79->48|79->48|84->53|84->53|85->54|89->58|89->58|89->58
                  -- GENERATED --
              */
          
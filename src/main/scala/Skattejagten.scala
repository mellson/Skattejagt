

object Skattejagten extends App {
  def dramatik(s: String, fart: Int = 100, newLine: Boolean = true): Unit = {
    for (c <- s) {
      print(c)
      Thread.sleep(fart)
    }
    if (newLine) print('\n')
    Thread.sleep(1000)
  }

  def ask(s: String, svar: List[String], hurra: String = "") = {
    var correct = false
    dramatik(s)
    while (!svar.contains(readLine().toLowerCase.trim)) {
      dramatik("Det er forkert!")
      dramatik(s)
    }
    if (hurra.isEmpty) dramatik("Korrekt, hvor er I dygtige")
    else dramatik(hurra)
  }

  def randomString(length: Int) = {
    val r = new scala.util.Random
    val sb = new StringBuilder
    for (i <- 1 to length) {
      sb.append(r.nextPrintableChar)
    }
    sb.toString
  }

  dramatik("Velkommen til den farlige skattejagt", newLine = false)
  dramatik(".....", 300)
  dramatik("Første spørgsmål")

  ask("Er I klar?", List("ja"))

  dramatik("Næste spørgsmål")
  ask("Hvad er orange, rundt og ofte set til halloween", List("graskar", "græskar", "et græskar", "et graskar"), "Hurra - det er rigtigt")
  dramatik("blip blop ", 80, newLine = false)
  dramatik("blip blop ", 30, newLine = false)
  dramatik("blip blop ", 60, newLine = false)
  dramatik(randomString(2560),1)
  dramatik("Undskyld, der gik lige fisk i maskinen")

  dramatik("Find jeres næste ledetråd ved et græskar")
  dramatik("Når I har fundet ledetråden har jeg det næste spørgsmål klar")
  dramatik("Jeg venter her mens I leder", newLine = false)
  dramatik("................", 1000)
  println()
  ask("Er I klar til spørgsmålet?", List("ja"), "godt, så kommer spørgsmålet her:")

  ask("Hvornår er rundetårnet opført?", List("1642"), "Jeg tror I har snydt. Det er korrekt")
  dramatik("Øv, jeg kan mærke jeg snart skal af med en præmie", 83)
  dramatik("Jeg må hellere lige finde på et svært spørgsmål")
  dramatik("tænker, vent venligst", 200)
  dramatik("tænker, vent venligst", 120)
  dramatik("Ha ha ha ha, nu kommer det")
  dramatik("Og det er UDEN ledetråd!!!")

  dramatik("Næste spørgsmål er meget svært, hold på hat og briller", newLine = false)
  dramatik("!!!!!!", 50)
  ask("Hvor gammel bliver Ditte?", List("29", "29 år", "29 år gammel"), "Flot, I er vidst nogle MEGET kloge børn")

  println("")
  dramatik("Jeres præmier kan I hente hos ")

  dramatik(randomString(40), 40, newLine = false)
  dramatik(randomString(80), 20, newLine = false)
  dramatik(randomString(160), 10, newLine = false)
  dramatik(randomString(320), 5, newLine = false)
  dramatik(randomString(640), 2, newLine = false)
  dramatik(randomString(1280), 1, newLine = false)

  println()
  dramatik("Hov, nu gik der ged i maskinen igen")
  println()
  dramatik("Sidste ledetråd:")
  dramatik("I kan hente jeres præmier hos en person der har langt mørkt hår")
  dramatik("en person der ikke hedder Gitte")
  dramatik("Sidste og ultimativt sværeste spørgsmål kommer nu")
  ask("Hvem har jeres præmier?", List("ditte"), "Øv, det er rigtigt. I er alt for dygtige til mig")
  dramatik("Skynd jer ud til Ditte og få jeres præmie inden jeg kortslutter jer")
  dramatik("GAME OVER", 3000)
  dramatik(randomString(20000), 40, newLine = false)
}

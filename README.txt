Generelle Informationen
----------------------
Der Studierende S05 wurde exmatrikuliert und hat dementsprechend seine Aufgaben nicht bearbeitet.
Dies bitte bei der Bewertung beachten.

Erklärungen
---------------------
S03
- Alles rund um das WhiteKnightTwo und das SpaceShipTwo wurde vom Detailgrad entsprechend
  den Informationen der Spezifikation modelliert
- Die Modellierung des SpacePort, des Tankfahrzeugs und des Towers ist bewusst einfach gehalten
  aufgrund der nicht vorhandenen Informationen in der Spezifikation.

Getroffene Annahmen
---------------------
S03
- Jedem WhiteKnightTwo ist genau einem SpaceShipTwo zugeordnet und umgekehrt
- Das SpaceShipTwo wird als Teil von WhiteKnightTwo verstanden und entsprechend via Aggregation modelliert
- SpaceShipTwo hat nur Teile via Aggregation modelliert, da eine physische Inklusion/Komposition nur modelliert werden soll, wenn explizit erwähnt.
- Jeder Wing hat nur ein Ruder, ein Elevon und einen Stabilisator
- Jedem SpacePort ist nur ein Tower zugeordnet und umgekehrt
- Jeder SpacePort hat mindestens ein Tankfahrzeug und keine maximale Anzahl
package life.domain

import life.domain.Board

// format: off
object Fixtures {
  val start: String = "🚪"
  val goal: String = "🪅"

  val obstacles: Set[String] =
    Set("🎉", "🎊", "🥳", "🎈", "🎂", "🍰", "🎁", "🎤", "🕺", "💃", "🎵", "🎶", "🎧", "🎠", "🎙", "📸", "🎇", "🎆", "👯", "🕴", "🤳", "🙌")

  val foods: Set[String] =
    Set("🍕", "🍔", "🍟", "🌮", "🍣", "🍱", "🍤", "🧀", "🥪", "🥭", "🧁", "🍩", "🍪", "🍫", "🍿", "🍦", "🍧", "🍨", "🍹", "🥂", "🍺", "🍻", "🥤", "🍷", "🥃")

  val board: Board[String] = Board(
    Vector(
      Vector("📸", "🎵", "🎊", "🎈", "🎵", "👯", "🤳", "🎂", "💃", "💃", "🍰", "🤳", "🥳", "🎶", "💃", "👯", "🥳", "🎠", "🎠", "📸", "🕴", "🎠", "🍰", "🎵", "🥳", "🎊", "🍰", "👯", "🎉", "🎤", "🤳", "💃", "🎈", "🎙", "🥳"),
      Vector("🙌", "🚪", "🎂", "🍻", "🍤", "🍪", "🥳", "🥤", "🍿", "🍷", "🍕", "🥃", "🍨", "🍫", "🍺", "🍱", "🎵", "🌮", "🍨", "🥤", "🥂", "🍩", "📸", "🍩", "🥭", "🍧", "🧀", "🧆", "🍷", "🥂", "🍷", "🧆", "🍦", "🍟", "🎶"),
      Vector("🎇", "🍱", "🎙", "🎇", "🎂", "🍱", "🎤", "🍔", "🎵", "🍫", "🎂", "📸", "👯", "🎤", "🍰", "🥤", "🎇", "🥭", "🤳", "🎊", "🙌", "🍣", "🎆", "🎵", "🎉", "💃", "🎉", "🍦", "👯", "🙌", "🤳", "🎂", "💃", "🍨", "🎙"),
      Vector("💃", "🍤", "🥤", "🥃", "💃", "🍻", "🧁", "🍔", "🎂", "🍫", "🍟", "🧁", "🍣", "🍦", "🎙", "🍟", "🍷", "🍔", "🎠", "🍩", "🎂", "🥭", "🙌", "🍔", "🍩", "🍤", "📸", "🍧", "🍱", "🥤", "🥤", "🍦", "🕴", "🍣", "🤳"),
      Vector("🎤", "🎧", "🙌", "🍦", "🎙", "👯", "🎂", "👯", "🎁", "🍰", "🙌", "🎁", "🎆", "🍟", "🎉", "🎵", "💃", "🎤", "🎊", "🌮", "💃", "🍔", "🕴", "🍣", "🎠", "🥂", "🥳", "🎵", "💃", "🎁", "🎇", "🙌", "🎶", "🍹", "🎉"),
      Vector("🎇", "🍹", "🎈", "🥃", "🥳", "🍫", "🍿", "🍦", "🍨", "🍧", "👯", "🍪", "🍨", "🍺", "🙌", "🍤", "🥭", "🧁", "🍕", "🌮", "🕴", "🍩", "🍕", "🍫", "👯", "🥂", "🍿", "🍱", "🍔", "🥃", "🎊", "🌮", "🧁", "🍩", "🙌"),
      Vector("🎊", "🥤", "🎂", "🍱", "🎁", "🍷", "🎆", "💃", "🎉", "🍕", "🎆", "🌮", "🤳", "🕴", "🎇", "🍹", "💃", "🎙", "🎉", "🍫", "🎵", "🎵", "🎉", "🎂", "🎉", "🤳", "🙌", "🍰", "🎤", "🍩", "🎂", "🍣", "🎊", "🍿", "🎉"),
      Vector("💃", "🍹", "🎙", "🥂", "🎇", "🥂", "🧆", "🍨", "🎵", "🍕", "🍫", "🥂", "🎂", "🍱", "🍦", "🌮", "🎇", "🧆", "🍺", "🍷", "🥂", "🥂", "🍕", "🧀", "🍨", "🍩", "🕴", "🍫", "🍩", "🍿", "🎶", "🥤", "🙌", "🍧", "🙌"),
      Vector("🤳", "🍣", "🎶", "🍿", "🤳", "🙌", "🍰", "🍷", "🎶", "🎶", "🎊", "🥳", "📸", "🍔", "🎂", "🍔", "🍰", "🍰", "🎠", "🎉", "🎁", "🎁", "📸", "🤳", "🎆", "🎙", "🎵", "🍱", "💃", "🎇", "🕴", "🍺", "🎠", "🍨", "🎧"),
      Vector("🕴", "🍿", "🍩", "🌮", "👯", "🥤", "🥭", "🍤", "💃", "🥭", "🍫", "🥭", "🎈", "🍟", "💃", "🍕", "🍔", "🍹", "🥤", "🥭", "🍿", "🌮", "🍣", "🧁", "🙌", "🧆", "🌮", "🍪", "🎊", "🍷", "🥂", "🍧", "👯", "🍺", "💃"),
      Vector("🎇", "🍷", "💃", "🙌", "🥳", "🧁", "💃", "🎙", "🎆", "🧀", "🙌", "👯", "🎶", "🍩", "🎠", "🎠", "🥳", "🙌", "👯", "🕴", "🎆", "📸", "🎈", "🍺", "🎶", "🍤", "🎧", "🥳", "🎤", "🍨", "💃", "🧁", "🎠", "🎊", "🎧"),
      Vector("🎉", "🍷", "🍹", "🍿", "🍹", "🧆", "📸", "🍤", "🧁", "🍤", "🎆", "🍔", "🍔", "🍩", "💃", "🍨", "🍤", "🧁", "🍕", "🍧", "🍦", "🥤", "🎉", "🍧", "🎙", "🍕", "🎆", "🍦", "🎊", "🍻", "🎠", "🍿", "🍣", "🍣", "🎇"),
      Vector("🎙", "🎈", "🎈", "👯", "🎇", "🎇", "🕴", "🍕", "💃", "🎤", "📸", "🧆", "🥳", "🙌", "🎁", "👯", "🎊", "💃", "🎊", "🍷", "💃", "🤳", "🤳", "🍤", "🎵", "🍟", "🙌", "🍿", "🎙", "🧆", "🤳", "🎂", "🤳", "🍤", "🙌"),
      Vector("🎉", "🍩", "🥂", "🍧", "🧆", "🍕", "🍻", "🍨", "🎆", "🍧", "🧀", "🌮", "🎵", "🍹", "🍫", "🥂", "🍿", "🧁", "🥭", "🍩", "🥳", "🍟", "🧀", "🍺", "🎊", "🍧", "🎤", "🧆", "🥃", "🍩", "🍪", "🍔", "🎙", "🍕", "🙌"),
      Vector("🙌", "🍣", "🎆", "🍱", "🥳", "🎊", "🙌", "🧁", "🍰", "🍩", "📸", "🕴", "🎙", "🍔", "🎈", "🎊", "🎶", "🎆", "🙌", "🥂", "🥳", "🍺", "🎧", "🍪", "🎊", "🥭", "🎊", "🎁", "🤳", "💃", "🎈", "🍹", "🎧", "🍱", "🎤"),
      Vector("🎈", "🍷", "🙌", "🍻", "🎠", "🍿", "💃", "🍫", "🎇", "🍷", "🤳", "🥃", "🎈", "🥃", "🍔", "🥭", "🎶", "🍧", "🍹", "🍣", "👯", "🍟", "🎤", "🍹", "🥳", "🍨", "🍤", "🍷", "🥳", "🍧", "🍟", "🧁", "🎶", "🧁", "🎧"),
      Vector("🎶", "🧀", "🎶", "🧆", "🙌", "🧀", "🙌", "🍦", "🎶", "🍷", "💃", "🥂", "🙌", "🍣", "🎂", "🍨", "🍰", "🧀", "🎶", "🙌", "📸", "🧁", "🎆", "🍰", "🎵", "🎆", "🥳", "🍫", "💃", "🎂", "🙌", "🥭", "🎊", "🍷", "🎙"),
      Vector("🙌", "🌮", "🎙", "🌮", "🎤", "🍷", "🧀", "🍔", "🥳", "🧁", "🎠", "🍟", "🍟", "🥃", "🕴", "🍫", "🎈", "🥃", "🍫", "🌮", "🍰", "🍻", "🍔", "🍣", "🥂", "🍫", "🎠", "🍩", "🍟", "🍔", "🎉", "🍩", "🎠", "🧀", "🙌"),
      Vector("🎇", "🥃", "🎠", "🍺", "🎆", "🎶", "🎉", "🥳", "🕴", "🍹", "🙌", "🍺", "🤳", "🕴", "🎙", "🍨", "🎇", "🍤", "🎇", "🕴", "🎂", "👯", "🎵", "🥭", "🎈", "📸", "🎉", "🤳", "🕴", "🍷", "🎁", "🎉", "🎵", "🍕", "🎇"),
      Vector("🎶", "🍧", "🕴", "🍣", "🍷", "🍿", "🥃", "🥃", "🍷", "🍺", "🎁", "🍦", "👯", "🧆", "🧁", "🍤", "📸", "🍔", "💃", "🍹", "🥭", "🍻", "💃", "🧁", "💃", "🍱", "🍤", "🥭", "🎵", "🧁", "🍷", "🥭", "🍧", "🍿", "🎉"),
      Vector("🎉", "🍱", "🎇", "🕴", "🎉", "🎈", "👯", "🤳", "🎵", "🤳", "🎁", "🍿", "📸", "🍟", "💃", "🤳", "🎠", "🍩", "🤳", "🥭", "🎧", "🧆", "🎈", "🍟", "🎂", "🍕", "🎧", "🥭", "🎤", "🎂", "🎁", "💃", "🎙", "🍺", "🎊"),
      Vector("🎵", "🍣", "🌮", "🍕", "🥂", "🍻", "🌮", "🍫", "🎧", "🍪", "🎁", "🍧", "🤳", "🍷", "🧀", "🍩", "👯", "🍣", "🙌", "🧀", "🎉", "🍧", "🍿", "🍻", "🎁", "🍪", "🎇", "🍕", "🧆", "🌮", "🎆", "🍦", "🧆", "🍧", "🍰"),
      Vector("🎇", "🍰", "🎠", "👯", "🎆", "🙌", "🥳", "🌮", "💃", "🍩", "💃", "🍣", "🥳", "🤳", "🙌", "🍹", "🙌", "🥳", "🎧", "🍩", "📸", "🎆", "🎶", "💃", "🎁", "🍷", "🎉", "🎂", "💃", "🥃", "👯", "🧀", "🎧", "🎙", "🤳"),
      Vector("🎙", "🧁", "🍪", "🍤", "🎠", "🥂", "🎧", "🍱", "🙌", "🍔", "🍟", "🧆", "🎶", "🍔", "💃", "🍷", "🍨", "🍕", "👯", "🍕", "🍺", "🍪", "🍱", "🍹", "🧆", "🍕", "🎶", "🥃", "🎂", "🍤", "🎊", "🍹", "🥃", "🥭", "🍰"),
      Vector("🍰", "🌮", "👯", "🍷", "🎊", "🧀", "🙌", "🍺", "🎈", "🍻", "🕴", "🎶", "🎇", "🍟", "🙌", "🕴", "🎶", "🍣", "🎙", "🎧", "🎈", "🥳", "🕴", "🎁", "🕴", "💃", "🎵", "🌮", "🎊", "🌮", "🥳", "🎇", "🥳", "🥭", "🎵"),
      Vector("🥳", "🥭", "💃", "🍻", "🍦", "🍷", "🎊", "🥃", "👯", "🍷", "🍔", "🍨", "🍦", "🍩", "🎤", "🥂", "🍤", "🍔", "🍪", "🍫", "🧁", "🥃", "🍺", "🍷", "🍫", "🍩", "🙌", "🍫", "🍰", "🥃", "🌮", "🍦", "🎆", "🍷", "🤳"),
      Vector("🎧", "🍩", "🥳", "🤳", "🎊", "🎙", "🎇", "🧆", "💃", "🍪", "📸", "💃", "🤳", "💃", "🍰", "🍺", "🎂", "📸", "📸", "🎊", "🎁", "🎵", "🎤", "🤳", "🕴", "🍧", "🎂", "🍷", "🎙", "🌮", "🎇", "🍹", "🎠", "🍟", "🎠"),
      Vector("🥳", "🌮", "🍺", "🍻", "🍿", "🧀", "💃", "🍤", "🎇", "🧆", "🎙", "🌮", "🍣", "🧆", "🎉", "🍻", "🍹", "🍣", "🙌", "🥭", "🎆", "🍪", "🌮", "🍟", "🍩", "🍧", "🎈", "🍤", "🎈", "🥤", "🎊", "🍦", "🎆", "🍕", "🎵"),
      Vector("🎉", "🥂", "🎂", "🎙", "💃", "🥭", "🎙", "🌮", "🎉", "💃", "🥳", "🥭", "🎵", "🍣", "🎇", "🎇", "👯", "🍧", "🥳", "🍩", "🙌", "🍺", "🎊", "🎵", "🍰", "👯", "🍰", "🥭", "📸", "🍔", "🎵", "🎁", "🎊", "🥭", "🕴"),
      Vector("👯", "🍩", "🍻", "🥭", "🥳", "🍧", "🎊", "🍨", "🍔", "🧆", "🍻", "🍩", "🎂", "🍟", "🍷", "🧆", "🥂", "🥂", "🎈", "🧀", "🍰", "🧁", "🎙", "🧆", "🍦", "🍤", "🥤", "🥂", "🎇", "🍪", "🍤", "🧆", "🧆", "🧆", "🤳"),
      Vector("🎇", "🎉", "🎈", "🥃", "🙌", "🍹", "🤳", "💃", "🎤", "🎶", "🎧", "💃", "🎁", "🕴", "🎉", "🎤", "💃", "🎠", "🥳", "🧁", "💃", "🍺", "🤳", "💃", "🎉", "🍺", "🎉", "🥂", "📸", "🥳", "🎆", "🎂", "🎧", "💃", "🕴"),
      Vector("🎇", "🍤", "🎶", "🥤", "🎠", "🍕", "🍨", "🧁", "🥭", "🍷", "🍤", "🧀", "🍨", "🍻", "🎂", "🍤", "🍦", "🧆", "🍣", "🧁", "👯", "🍹", "🍪", "🥭", "👯", "🍦", "🎠", "🧆", "🍷", "🧁", "🎁", "🍿", "🍔", "🍺", "📸"),
      Vector("🙌", "🍦", "🕴", "🍩", "🎁", "🙌", "🍰", "🎂", "🕴", "🍿", "👯", "🍰", "🎁", "🎧", "🎙", "🍻", "🤳", "🤳", "🎤", "🍣", "🍰", "🎶", "🙌", "🍷", "🎵", "💃", "🎉", "🍿", "🕴", "🍪", "💃", "💃", "🎠", "🍧", "📸"),
      Vector("📸", "🍔", "🍱", "🍕", "🍱", "🥂", "🍱", "🍧", "🎊", "🍦", "🍹", "🍟", "🍪", "🍿", "🥂", "🌮", "🥂", "🍩", "🎠", "🍨", "🌮", "🍩", "🍕", "🍤", "🥤", "🧀", "🌮", "🍔", "🎙", "🍧", "🍤", "🍩", "🍕", "🪅", "🎧"),
      Vector("🎉", "🥳", "🎙", "💃", "🎊", "🎶", "🎠", "🎊", "🎶", "🎁", "🕴", "🙌", "📸", "🎇", "🎤", "🎠", "💃", "📸", "🎙", "👯", "🍰", "🎶", "👯", "🎧", "🎁", "💃", "🎁", "🕴", "🎈", "🎉", "🎊", "🙌", "📸", "👯", "💃")
    )
  )
}
// format: on

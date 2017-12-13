package com.github.plavreshin

import java.time.Instant

sealed trait Event extends Product with Serializable {
  def timestamp: Instant
}

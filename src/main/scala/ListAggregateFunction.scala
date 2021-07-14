import org.apache.flink.api.common.functions.AggregateFunction

class ListAggregateFunction[T] extends AggregateFunction[T, List[T], List[T]] {
  override def createAccumulator(): List[T] = List[T]()
  override def add(value: T, accumulator: List[T]): List[T] = value :: accumulator
  override def getResult(accumulator: List[T]): List[T] = accumulator
  override def merge(a: List[T], b: List[T]): List[T] = a ::: b
}

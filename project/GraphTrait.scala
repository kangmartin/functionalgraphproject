trait GraphTrait [V,W] {
  def vertices: Set[V]
  def edges: Set[(V, V, W)]
  def neighbors(vertex: V): Set[(V, W)]
  def addEdge(from: V, to: V, weight: W): GraphTrait[V, W]
  def removeEdge(from: V, to: V): GraphTrait[V, W]
}

package clienttest

import org.junit.Test
import iterace.IteRaceOption._
import iterace.IteRaceOption
import iterace.stage.RaceAbstractTest

class TestPaperExample extends RaceAbstractTest {
  import IteRaceOption._
  val entryClass = "Lparticles/NBodySimulation"
  override val options = Set[IteRaceOption](Filtering, TwoThreads, BubbleUp, Synchronized, DeepSynchronized)

  @Test def compute = expect("""
Loop: particles.NBodySimulation.compute(NBodySimulation.java:36)

java.util.ArrayList: particles.NBodySimulation.<init>(NBodySimulation.java:23)
 application level
   (a)  particles.NBodySimulation$2.op(NBodySimulation.java:54)
   (b)  particles.NBodySimulation$2.op(NBodySimulation.java:54)
particles.NBodySimulation$Particle: particles.NBodySimulation$2.op(NBodySimulation.java:46)
 .x
   (a)  particles.NBodySimulation$2.op(NBodySimulation.java:50)
   (b)  particles.NBodySimulation$2.op(NBodySimulation.java:50) [2x]
 .y
   (a)  particles.NBodySimulation$2.op(NBodySimulation.java:51)
   (b)  particles.NBodySimulation$2.op(NBodySimulation.java:51) [2x]
particles.NBodySimulation: com.ibm.wala.FakeRootClass.fakeRootMethod(FakeRootClass.java:)
 .centerOfMass
   (a)  particles.NBodySimulation$2.op(NBodySimulation.java:46)
   (b)  particles.NBodySimulation$2.op(NBodySimulation.java:45)
        particles.NBodySimulation$2.op(NBodySimulation.java:46)
        particles.NBodySimulation$2.op(NBodySimulation.java:48)
         L: java.lang.Object: particles.NBodySimulation.<init>(NBodySimulation.java:22)-outside
        particles.NBodySimulation$2.op(NBodySimulation.java:50)
        particles.NBodySimulation$2.op(NBodySimulation.java:51)
        particles.NBodySimulation$2.op(NBodySimulation.java:53)
        particles.NBodySimulation$2.op(NBodySimulation.java:54)
""")
}
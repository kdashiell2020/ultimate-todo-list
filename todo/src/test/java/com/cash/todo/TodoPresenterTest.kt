package com.cash.todo

import app.cash.turbine.turbineScope
import com.cash.backend.RealTaskRepo
import kotlinx.coroutines.runBlocking
import org.junit.Test

class TodoPresenterTest {
   private fun makePresenter(): TodoPresenter {
      return TodoPresenter(repo = RealTaskRepo())
   }

   @Test
   fun `Todo presenter returns view model`() = runBlocking {
      makePresenter().run { turbineScope {

      } }
   }
}


//@Test fun `chat contact option omitted when feature disabled`() {
//   val args = args.copy(chatStatus = FeatureDisabled)
//   val viewModel = createPresenter(args).apply(Observable.empty()).test(rxRule).takeLoadedValue()
//   assertThat(viewModel.contactOptions).isEmpty()
//}
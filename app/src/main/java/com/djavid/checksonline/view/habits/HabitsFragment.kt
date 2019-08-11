package com.djavid.checksonline.view.habits

import android.os.Bundle
import android.view.View
import com.djavid.checksonline.R
import com.djavid.checksonline.base.BaseFragment
import com.djavid.checksonline.contracts.habits.HabitsContract
import org.kodein.di.generic.instance

class HabitsFragment : BaseFragment() {
	
	private val presenter: HabitsContract.Presenter by instance()

    override val layoutResId = R.layout.fragment_habits

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		presenter.init()
    }

}
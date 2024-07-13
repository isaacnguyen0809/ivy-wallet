import androidx.compose.runtime.Composable
import com.ivy.home.HomeUiTest
import com.ivy.ui.testing.IvyPreviews

@IvyPreviews
@Composable
private fun PreviewHomeTabLight() {
    HomeUiTest(isDark = false)
}

@IvyPreviews
@Composable
private fun PreviewHomeTabDark() {
    HomeUiTest(isDark = true)
}
package com.harikrish.profilecardlayout

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.compose.AsyncImage
import com.codingtroops.profilecardlayout.UserProfile
import com.codingtroops.profilecardlayout.userProfileList
import com.harikrish.profilecardlayout.ui.theme.ProfileCardLayoutTheme
import com.harikrish.profilecardlayout.ui.theme.lightGreen200
import com.harikrish.profilecardlayout.ui.theme.lightGreen800
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardLayoutTheme {
                UserApplication()
            }

        }
    }
}

@Composable
fun UserApplication(userProfiles: List<UserProfile> = userProfileList) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "users_list") {
        composable("users_list") {
            UserListScreen(userProfileList, navController)
        }
        composable(route = "user_details/{userId}",
            arguments = listOf(navArgument(name="userId"){
                type = NavType.IntType
            })
        ) { navBackStackEntry ->
            UserDetailScreen(navBackStackEntry.arguments!!.getInt("userId"), navController)
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UserListScreen(userProfiles: List<UserProfile>, navController: NavHostController) {
    Scaffold(topBar = { AppBar(false, navController) }) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            color = Color.LightGray
        ) {
            LazyColumn {
                items(userProfiles) { userProfile ->
                    ProfileCard(userProfile = userProfile) {
                        navController.navigate("user_details/${userProfile.id}")
                    }
                }

            }
        }
    }

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UserDetailScreen(userId: Int, navController: NavHostController?) {
    val userProfile = userProfileList.first { userProfile -> userId == userProfile.id }
    Scaffold(topBar = { AppBar(true, navController) }) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            color = Color.LightGray
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                ProfilePicture(userProfile.pictureUrl, userProfile.status, 240.dp)
                ProfileContent(userProfile.name, userProfile.status, Alignment.CenterHorizontally, true, userProfile.bio)
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(notHomePage: Boolean, navController: NavHostController?) {
    TopAppBar(
        navigationIcon = {
            if (notHomePage) {
                IconButton(onClick = { navController?.navigateUp() }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back",
                        Modifier.padding(horizontal = 12.dp),
                        tint = Color.White)
                }
            }else {
                Icon(
                    Icons.Filled.Send,
                    contentDescription = "Home",
                    Modifier.padding(horizontal = 12.dp),
                    tint = Color.White
                )
            }

        },
        title = {
            Text(
                text = "Messaging App",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.White
            )
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = lightGreen800
        )

    )
}

@Composable
fun ProfileCard(userProfile: UserProfile, clickAction: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
            .clickable { clickAction.invoke() },
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = CutCornerShape(topEnd = 24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture(userProfile.pictureUrl, userProfile.status, 72.dp)
            ProfileContent(userProfile.name, userProfile.status, Alignment.Start,false, userProfile.bio)
        }
    }
}

@Composable
fun ProfilePicture(pictureUrl: String, online: Boolean, imageSize: Dp) {

    Card(
        shape = CircleShape,
        border = BorderStroke(
            width = 2.dp,
            color = if (online) lightGreen200 else Color.Red
        ),
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        AsyncImage(
            model = pictureUrl,
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(imageSize)
        )
    }

}

@Composable
fun ProfileContent(name: String, online: Boolean, alignment: Alignment.Horizontal, isDetailsPage: Boolean, bio: String) {
    Column(
        modifier = Modifier
            .padding(8.dp),
        horizontalAlignment = alignment
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.titleLarge,
            modifier = if (online) Modifier.alpha(1f)
            else Modifier.alpha(0.5f)
        )

        Text(
            text = if (online) "Active now" else "Offline",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.alpha(0.5f)
        )

        if (isDetailsPage) {
            Text(
                text = bio,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.alpha(1f)
                    .padding(16.dp)
            )
        }


    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileCardLayoutTheme {
        UserApplication()
    }
}

@Preview(showBackground = true)
@Composable
fun UserDetailPreview() {
    ProfileCardLayoutTheme {
        UserDetailScreen(0, null)
    }
}
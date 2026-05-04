import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'firebase_options.dart';

void main() async {
    WidgetsFlutterBinding.ensureInitialized();

    await Firebase.initializeApp(
            options: DefaultFirebaseOptions.currentPlatform,
    );

    runApp(const MyApp());
}

class MyApp extends StatelessWidget {
    const MyApp({super.key});

    @override
    Widget build(BuildContext context) {
        return MaterialApp(
            title: 'Hello Firebase App',
        debugShowCheckedModeBanner: false,
        theme: ThemeData(
        colorSchemeSeed: Colors.orange,
        useMaterial3: true,
        ),
        home: const HomePage(),
        );
    }
}

class HomePage extends StatelessWidget {
    const HomePage({super.key});

    @override
    Widget build(BuildContext context) {
        final firebaseAppsCount = Firebase.apps.length;

        return Scaffold(
            appBar: AppBar(
                    title: const Text("Programmer's Picnic"),
            centerTitle: true,
        ),
        body: Center(
        child: Card(
        margin: const EdgeInsets.all(24),
        elevation: 4,
        child: Padding(
        padding: const EdgeInsets.all(28),
        child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
        const Icon(
                Icons.local_fire_department,
        size: 72,
        color: Colors.orange,
        ),
        const SizedBox(height: 16),
        const Text(
                'Hello Firebase App',
        style: TextStyle(
        fontSize: 26,
        fontWeight: FontWeight.bold,
        ),
        textAlign: TextAlign.center,
        ),
        const SizedBox(height: 12),
        Text(
            'Firebase apps connected: $firebaseAppsCount',
            style: const TextStyle(fontSize: 18),
        ),
        const SizedBox(height: 12),
        const Text(
                'If this screen opens without error, Firebase is initialized successfully.',
        textAlign: TextAlign.center,
        ),
        ],
        ),
        ),
        ),
        ),
        );
    }
}
//Amit